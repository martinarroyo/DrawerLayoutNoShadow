package com.drawerlayoutnoshadow.drawerLayout;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

//import com.drawerlayoutnoshadow.drawerLayout.DrawerLayoutNoShadowManager;
//import com.drawerlayoutnoshadow.drawerLayout.DrawerLayoutNoShadow;

public class DrawerLayoutNoShadowPackage implements ReactPackage {
    
    @Override public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        DrawerLayoutNoShadowManager manager = new DrawerLayoutNoShadowManager();
        return Arrays.<ViewManager>asList(manager);
    }

    @Override public List<NativeModule> createNativeModules( ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        return modules;
    }
}
