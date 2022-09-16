package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nzu  reason: default package */
/* loaded from: classes3.dex */
public class nzu extends nzn {
    private final View a;
    final nzy d;

    public nzu(nzy nzyVar, View view) {
        this.d = nzyVar;
        this.a = view;
    }

    @Override // defpackage.nzn
    public final float a() {
        return this.d.c().l();
    }

    @Override // defpackage.nzn
    public Rect b() {
        return this.d.d(1).r();
    }

    @Override // defpackage.nzn
    public Rect c() {
        return this.d.c().r();
    }

    @Override // defpackage.nzn
    public View d() {
        return this.a;
    }

    @Override // defpackage.nzn
    public boolean g() {
        return this.d.m();
    }
}
