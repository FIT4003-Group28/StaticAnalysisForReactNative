package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.z;
/* loaded from: classes.dex */
public class a extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private z f6378b;

    public a(Context context) {
        super(context);
        this.f6378b = new z(context);
        this.f6378b.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.f6378b.setGravity(17);
        this.f6378b.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(this.f6378b);
    }

    public void setName(String str) {
        z zVar = this.f6378b;
        zVar.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
