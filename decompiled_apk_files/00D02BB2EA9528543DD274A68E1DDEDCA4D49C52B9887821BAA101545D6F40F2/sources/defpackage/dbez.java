package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbez  reason: default package */
/* loaded from: classes5.dex */
public final class dbez {
    public final boolean a;
    public final dbep b;
    private final dbeb f;
    private final dbeb g;
    public final ArrayList<dbfb> d = new ArrayList<>();
    public final int e = 2;
    public float c = 420.0f;

    public dbez(dbey dbeyVar) {
        this.a = dbeyVar.a;
        this.f = dbeyVar.b;
        this.g = dbeyVar.c;
        this.b = dbeyVar.d;
    }

    public final dbeb a() {
        return new dbeb(this.f);
    }

    public final dbeb b() {
        return new dbeb(this.g);
    }

    public final dbep c() {
        return new dbep(this.b);
    }

    public final void d() {
        ArrayList<dbfb> arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a.f = true;
        }
    }
}
