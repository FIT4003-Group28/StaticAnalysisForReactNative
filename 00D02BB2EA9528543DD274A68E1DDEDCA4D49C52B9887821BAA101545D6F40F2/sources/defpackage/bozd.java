package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bozd  reason: default package */
/* loaded from: classes3.dex */
public class bozd implements bpwf {
    public final bpwe a;
    public final Resources b;
    private final boyt c;
    private boolean d;

    public bozd(boyt boytVar, bpwe bpweVar, Resources resources, cqhn cqhnVar) {
        this.c = boytVar;
        this.a = bpweVar;
        this.b = resources;
    }

    @Override // defpackage.bpwf
    public String a() {
        return dbsj.e(this.c.c);
    }

    @Override // defpackage.bpwf
    public CharSequence b() {
        return this.b.getString(R.string.EXTENT_PICKER_INITIAL_HINT);
    }

    @Override // defpackage.bpwf
    public CharSequence c() {
        return this.b.getString(R.string.EXTENT_PICKER_HINT);
    }

    @Override // defpackage.bpwf
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bpwf
    public void e(boolean z) {
        if (this.d != z) {
            this.d = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bpwf
    public jad f() {
        if (this.c.e.isEmpty()) {
            return null;
        }
        return new bozb(this);
    }

    @Override // defpackage.bpwf
    public jad g() {
        return new bozc(this);
    }
}
