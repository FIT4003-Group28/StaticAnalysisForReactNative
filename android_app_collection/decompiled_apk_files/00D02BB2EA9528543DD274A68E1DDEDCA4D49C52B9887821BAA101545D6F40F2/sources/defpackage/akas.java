package defpackage;

import android.app.Application;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akas  reason: default package */
/* loaded from: classes2.dex */
public final class akas {
    public final ailb<aihw> a;
    public final akai b;
    public final akfa c;
    public final auhi d;
    public final bvjj e;
    public final auhj f;
    public final Application g;
    public final ajmq h;
    public final Executor i;
    public dbsg<crzp<List<btlu>>> j = dbpy.a;

    public akas(akai akaiVar, ailb<aihw> ailbVar, akfa akfaVar, auhi auhiVar, bvjj bvjjVar, auhj auhjVar, Application application, ajmq ajmqVar, Executor executor) {
        this.a = ailbVar;
        this.b = akaiVar;
        this.c = akfaVar;
        this.d = auhiVar;
        this.e = bvjjVar;
        this.f = auhjVar;
        this.g = application;
        this.h = ajmqVar;
        this.i = executor;
    }

    public static final void a() {
        bvrj.UI_THREAD.c();
    }

    public static final void b(List<btlu> list) {
        for (btlu btluVar : list) {
            a();
        }
    }
}
