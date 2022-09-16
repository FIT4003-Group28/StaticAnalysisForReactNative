package defpackage;

import android.app.AlertDialog;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eke  reason: default package */
/* loaded from: classes3.dex */
public final class eke {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ AlertDialog c;
    final /* synthetic */ TextInputLayout d;
    final /* synthetic */ TextInputLayout e;
    final /* synthetic */ eki f;
    final /* synthetic */ aopa g;
    final /* synthetic */ aopa h;
    final /* synthetic */ aopa i;

    public eke(eki ekiVar, aopa aopaVar, String str, aopa aopaVar2, aopa aopaVar3, String str2, AlertDialog alertDialog, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.f = ekiVar;
        this.g = aopaVar;
        this.a = str;
        this.h = aopaVar2;
        this.i = aopaVar3;
        this.b = str2;
        this.c = alertDialog;
        this.d = textInputLayout;
        this.e = textInputLayout2;
    }

    public final void a(int i, String str) {
        int i2 = i - 1;
        if (i2 == 1) {
            this.d.v(str);
        } else if (i2 == 2) {
            this.e.v(str);
        } else {
            this.f.d.d(str);
        }
    }
}
