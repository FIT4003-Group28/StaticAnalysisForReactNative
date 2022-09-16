package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* renamed from: bkex  reason: default package */
/* loaded from: classes3.dex */
public class bkex implements bkfo {
    private final Activity a;
    private final bkfd b;
    private final ilo c;
    private final dxio<apyz> d;

    public bkex(Activity activity, dxio<apyz> dxioVar, bkfd bkfdVar, ilo iloVar) {
        this.a = activity;
        this.d = dxioVar;
        this.b = bkfdVar;
        this.c = iloVar;
    }

    @Override // defpackage.bkfo
    public String a() {
        return this.a.getString(R.string.BUSINESS_MESSAGING_QUOTES_SNACKBAR_BODY);
    }

    @Override // defpackage.bkfo
    public String b() {
        return this.a.getString(R.string.BUSINESS_MESSAGING_QUOTES_TOAST_MESSAGING_BUTTON);
    }

    @Override // defpackage.bkfo
    public cqkl c() {
        if (this.d.a().o()) {
            this.d.a().m(this.c, apzb.PLACEPAGE_TOAST_QUOTE);
        }
        this.b.d();
        return cqkl.a;
    }

    @Override // defpackage.bkfo
    public cjtd d() {
        return cjtd.a(dtxy.lD);
    }

    @Override // defpackage.bkfo
    public Boolean e() {
        return true;
    }

    @Override // defpackage.bkfo
    public cqkl f() {
        this.b.d();
        return cqkl.a;
    }

    @Override // defpackage.bkfo
    public cjtd g() {
        return cjtd.a(dtxy.lC);
    }
}
