package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.facebook.react.k;
/* loaded from: classes.dex */
public class d extends Dialog {
    public d(Activity activity, View view) {
        super(activity, k.Theme_Catalyst_LogBox);
        requestWindowFeature(1);
        setContentView(view);
    }
}
