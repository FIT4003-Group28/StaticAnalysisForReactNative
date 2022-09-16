package com.google.cardboard.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class CardboardLayout extends FrameLayout {
    private RelativeLayout alignmentMarker;
    private ImageButton backButton;
    private FrameLayout backButtonHolder;
    private Handler handler;
    private ImageButton settingsButton;
    private FrameLayout settingsButtonHolder;

    public CardboardLayout(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        this.handler = new Handler(Looper.getMainLooper());
        View inflate = inflate(getContext(), R.layout.cardboard_ui, null);
        addView(inflate);
        this.alignmentMarker = (RelativeLayout) findViewById(R.id.ui_alignment_marker);
        this.backButtonHolder = (FrameLayout) findViewById(R.id.ui_back_button_holder);
        this.backButton = (ImageButton) inflate.findViewById(R.id.ui_back_button);
        this.settingsButtonHolder = (FrameLayout) findViewById(R.id.ui_settings_button_holder);
        this.settingsButton = (ImageButton) inflate.findViewById(R.id.ui_settings_button);
    }

    public void hideAlignmentMarker() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CardboardLayout.this.lambda$hideAlignmentMarker$1$CardboardLayout();
            }
        });
    }

    public void hideAll() {
        hideAlignmentMarker();
        hideBackButton();
        hideSettingsButton();
    }

    public void hideBackButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CardboardLayout.this.lambda$hideBackButton$3$CardboardLayout();
            }
        });
    }

    public void hideSettingsButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CardboardLayout.this.lambda$hideSettingsButton$5$CardboardLayout();
            }
        });
    }

    public /* synthetic */ void lambda$hideAlignmentMarker$1$CardboardLayout() {
        this.alignmentMarker.setVisibility(4);
    }

    public /* synthetic */ void lambda$hideBackButton$3$CardboardLayout() {
        this.backButtonHolder.setVisibility(4);
    }

    public /* synthetic */ void lambda$hideSettingsButton$5$CardboardLayout() {
        this.settingsButtonHolder.setVisibility(4);
    }

    public /* synthetic */ void lambda$showAlignmentMarker$0$CardboardLayout() {
        this.alignmentMarker.setVisibility(0);
        this.alignmentMarker.bringToFront();
    }

    public /* synthetic */ void lambda$showBackButton$2$CardboardLayout() {
        this.backButtonHolder.setVisibility(0);
        this.backButtonHolder.bringToFront();
    }

    public /* synthetic */ void lambda$showSettingsButton$4$CardboardLayout() {
        this.settingsButtonHolder.setVisibility(0);
        this.settingsButtonHolder.bringToFront();
    }

    public void setOnBackButtonClick(final Runnable runnable) {
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public void setOnSettingskButtonClick(final Runnable runnable) {
        this.settingsButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public void showAlignmentMarker() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CardboardLayout.this.lambda$showAlignmentMarker$0$CardboardLayout();
            }
        });
    }

    public void showAll() {
        showAlignmentMarker();
        showBackButton();
        showSettingsButton();
    }

    public void showBackButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                CardboardLayout.this.lambda$showBackButton$2$CardboardLayout();
            }
        });
    }

    public void showSettingsButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                CardboardLayout.this.lambda$showSettingsButton$4$CardboardLayout();
            }
        });
    }

    public CardboardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    public CardboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize();
    }
}
