package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
/* compiled from: DoubleTapReloadRecognizer.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3312a = false;

    public boolean a(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.f3312a) {
                this.f3312a = false;
                return true;
            }
            this.f3312a = true;
            new Handler().postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.c.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.f3312a = false;
                }
            }, 200L);
        }
        return false;
    }
}
