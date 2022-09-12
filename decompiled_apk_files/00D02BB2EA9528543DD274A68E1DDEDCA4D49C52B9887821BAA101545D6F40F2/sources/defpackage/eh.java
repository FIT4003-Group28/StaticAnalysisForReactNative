package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: eh  reason: default package */
/* loaded from: classes6.dex */
public final class eh {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList<eg> e = new ArrayList<>();

    public eh(ed edVar) {
        this.a = edVar.w;
        this.b = edVar.x;
        this.c = edVar.d();
        this.d = edVar.g();
        ArrayList<ec> arrayList = edVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new eg(arrayList.get(i)));
        }
    }
}
