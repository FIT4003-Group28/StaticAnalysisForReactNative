package com.nativemodulebenchmark;

import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;

import java.util.Map;

public class CustomNativeButtonManager extends SimpleViewManager<AppCompatButton> {

    public static final String REACT_CLASS = "CustomNativeButton";
    ReactApplicationContext mCallerContext;

    public CustomNativeButtonManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @NonNull
    @Override
    public AppCompatButton createViewInstance(ThemedReactContext context) {
        AppCompatButton button = new AppCompatButton(context);
        onReceiveNativeEvent(context, button);
        return button;
    }

    @ReactProp(name = "title")
    public void setTitle(AppCompatButton button, @Nullable String title) {
        if (title != null) {
            button.setText(title);
        }
        else {
            button.setText("Default Button");
        }
    }


    public void onReceiveNativeEvent(ThemedReactContext context, Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View b) {
                WritableMap event = Arguments.createMap();
                context.getJSModule(RCTEventEmitter.class).receiveEvent(button.getId(), "onClick", event);
            }
        });
    }


    @Nullable @Override
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.<String, Object>builder()
                .put("onClick",
                        MapBuilder.of("registrationName", "onClick"))
                .build();
    }
}
