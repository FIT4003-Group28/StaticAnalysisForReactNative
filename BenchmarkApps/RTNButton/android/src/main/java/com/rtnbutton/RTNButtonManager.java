package com.rtnbutton;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.viewmanagers.RTNButtonManagerInterface;
import com.facebook.react.viewmanagers.RTNButtonManagerDelegate;

import java.util.Map;


@ReactModule(name = RTNButtonManager.NAME)
public class RTNButtonManager extends SimpleViewManager<RTNButton>
        implements RTNButtonManagerInterface<RTNButton> {

    private final ViewManagerDelegate<RTNButton> mDelegate;

    static final String NAME = "RTNButton";

    public RTNButtonManager(ReactApplicationContext context) {
        mDelegate = new RTNButtonManagerDelegate<>(this);
    }

    @Nullable
    @Override
    protected ViewManagerDelegate<RTNButton> getDelegate() {
        return mDelegate;
    }

    @NonNull
    @Override
    public String getName() {
        return RTNButtonManager.NAME;
    }

    @NonNull
    @Override
    public RTNButton createViewInstance(ThemedReactContext context) {
        RTNButton button = new RTNButton(context);
        onReceiveNativeEvent(context, button);
        return button;
    }

    @ReactProp(name = "title")
    public void setTitle(RTNButton button, @Nullable String title) {
        if (title != null) {
            button.setText(title);
        }
        else {
            button.setText("Default Button");
        }
    }


    public void onReceiveNativeEvent(ThemedReactContext context, RTNButton button) {
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
