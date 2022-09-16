package defpackage;

import android.content.Context;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: PG */
/* renamed from: dkx  reason: default package */
/* loaded from: classes3.dex */
public final class dkx {
    public int a = -1;
    public float b = 4.0f;
    public cyv c;
    public boolean d;
    public boolean e;
    public int f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public dkn o;
    public boolean p;
    public boolean q;
    public djo r;
    public dbu s;
    public akcx t;

    public dkx() {
        Field field = dlc.a;
        this.h = true;
        this.i = false;
        boolean z = dfz.a;
        this.j = dfz.l;
        this.k = -1;
        this.l = dfz.j;
        this.m = dfz.k;
        this.n = true;
        this.p = false;
        this.q = false;
    }

    public final dlc a(cyv cyvVar) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        this.c = new cyv(cyvVar.b, cyvVar.c, cyvVar.l, cyvVar.n(), (byte[]) null);
        boolean z = false;
        this.h = this.h && ((componentTree2 = cyvVar.j) == null || componentTree2.j);
        if (this.n && ((componentTree = cyvVar.j) == null || componentTree.k)) {
            z = true;
        }
        this.n = z;
        ComponentTree componentTree3 = cyvVar.j;
        if (this.r == null) {
            Context context = cyvVar.b;
            this.r = new djo(1);
        }
        return new dlc(this);
    }
}
