package com.google.firebase.crashlytics.c.p;

import c.e.a.a.h;
import c.e.a.b.g.i;
import com.google.firebase.crashlytics.c.h.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f9098a;

    /* renamed from: b  reason: collision with root package name */
    private final q f9099b;

    private a(i iVar, q qVar) {
        this.f9098a = iVar;
        this.f9099b = qVar;
    }

    public static h a(i iVar, q qVar) {
        return new a(iVar, qVar);
    }

    @Override // c.e.a.a.h
    public void a(Exception exc) {
        c.a(this.f9098a, this.f9099b, exc);
    }
}
