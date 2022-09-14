package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import c.e.a.b.d.g.nd;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7556b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7557c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fa f7558d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ nd f7559e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ y7 f7560f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o8(y7 y7Var, String str, String str2, fa faVar, nd ndVar) {
        this.f7560f = y7Var;
        this.f7556b = str;
        this.f7557c = str2;
        this.f7558d = faVar;
        this.f7559e = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r3 r3Var;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                r3Var = this.f7560f.f7806d;
                if (r3Var == null) {
                    this.f7560f.c().s().a("Failed to get conditional properties; not connected to service", this.f7556b, this.f7557c);
                } else {
                    arrayList = z9.b(r3Var.a(this.f7556b, this.f7557c, this.f7558d));
                    this.f7560f.K();
                }
            } catch (RemoteException e2) {
                this.f7560f.c().s().a("Failed to get conditional properties; remote exception", this.f7556b, this.f7557c, e2);
            }
        } finally {
            this.f7560f.j().a(this.f7559e, arrayList);
        }
    }
}
