package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bktr  reason: default package */
/* loaded from: classes3.dex */
public class bktr implements bkrw {
    private final Resources b;
    private final blhs c;
    private final blif d;
    private final String e;
    private final int f;
    @dzsi
    private final cqtd g;
    private final bktq h;
    private final cjtd i;

    public bktr(Resources resources, blhs blhsVar, blif blifVar, int i, int i2, @dzsi cqtd cqtdVar, cjtd cjtdVar, bktq bktqVar) {
        this.b = resources;
        this.c = blhsVar;
        this.d = blifVar;
        this.e = resources.getString(i);
        this.f = i2;
        this.g = cqtdVar;
        this.i = cjtdVar;
        this.h = bktqVar;
    }

    @Override // defpackage.bkrw
    @dzsi
    public cqtd a() {
        return this.g;
    }

    @Override // defpackage.bkrw
    public cjtd b() {
        return null;
    }

    @Override // defpackage.bkrw
    public int c() {
        return 1;
    }

    @Override // defpackage.bkrw
    public CharSequence d() {
        return this.e;
    }

    @Override // defpackage.bkrw
    public CharSequence e() {
        return "";
    }

    @Override // defpackage.bkrw
    public cqkl f() {
        this.c.h(null, this.d, null, null);
        this.h.A(this.d);
        return cqkl.a;
    }

    @Override // defpackage.bkrw
    public Boolean g() {
        return Boolean.valueOf(this.d.equals(this.c.f()));
    }

    @Override // defpackage.bkrw
    public cjtd h() {
        return this.i;
    }

    @Override // defpackage.bkrw
    public CharSequence i() {
        return this.b.getString(this.f, this.b.getString(true != g().booleanValue() ? R.string.REVIEW_FILTER_NOT_SELECTED_STATE : R.string.REVIEW_FILTER_SELECTED_STATE));
    }
}
