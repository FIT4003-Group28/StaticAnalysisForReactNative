package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ch  reason: default package */
/* loaded from: classes2.dex */
public final class ch {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public ch(cd cdVar) {
        this.a = cdVar.w;
        this.b = cdVar.x;
        this.c = cdVar.h();
        this.d = cdVar.d();
        ArrayList arrayList = cdVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new cg((cc) arrayList.get(i)));
        }
    }
}
