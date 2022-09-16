package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: akir  reason: default package */
/* loaded from: classes.dex */
public final class akir {
    public int B;
    final int C;
    final CronetEngine a;
    final vzm b;
    final aaqf c;
    final afvn d;
    final Executor e;
    final Handler f;
    final String g;
    final axxo h;
    final akip i;
    final akio j;
    final int k;
    final String n;
    final byte[] o;
    final int p;
    final int q;
    final String r;
    final String t;
    public boolean u;
    public boolean v;
    public boolean w;
    public float x = 0.7f;
    int y = 1024;
    public ampq z = amon.a;
    public int D = 2;
    String A = "embeddedassistant.googleapis.com";
    final String l = "PLACEHOLDER";
    final String m = "PLACEHOLDER";
    final String s = "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w";

    public akir(CronetEngine cronetEngine, vzm vzmVar, aaqf aaqfVar, afvn afvnVar, Executor executor, Handler handler, String str, axxo axxoVar, akip akipVar, akio akioVar, int i, String str2, byte[] bArr, int i2, int i3, int i4, String str3, String str4) {
        this.a = cronetEngine;
        this.b = vzmVar;
        this.c = aaqfVar;
        this.d = afvnVar;
        this.e = executor;
        this.f = handler;
        this.g = str;
        this.h = axxoVar;
        this.i = akipVar;
        this.j = akioVar;
        this.k = i;
        this.n = str2;
        this.o = bArr;
        this.C = i2;
        this.p = i3;
        this.q = i4;
        this.r = str3;
        this.t = str4;
    }

    public final akiq a() {
        return new akiq(this);
    }

    public final void b(ampq ampqVar) {
        this.A = (String) ((ampv) ampqVar).a;
    }

    public final void c(int i) {
        if (i <= 0) {
            i = 1024;
        }
        this.y = i;
    }
}
