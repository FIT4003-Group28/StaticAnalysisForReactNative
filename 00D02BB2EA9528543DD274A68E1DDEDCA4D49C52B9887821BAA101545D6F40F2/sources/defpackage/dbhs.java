package defpackage;

import com.google.ar.sceneform.rendering.Material;
import com.google.ar.sceneform.rendering.Texture;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbhs  reason: default package */
/* loaded from: classes5.dex */
public final class dbhs {
    private static dbhs k;
    public final ArrayList<dbit> a = new ArrayList<>();
    public final dbiv<Texture> b;
    public final dbiv<Material> c;
    public final dbiv<dbgt> d;
    public final dbiv<dbip> e;
    public final dbeo<dbem> f;
    public final dbeo<dbes> g;
    public final dbeo<Material> h;
    public final dbeo<dbhl> i;
    public final dbeo<Texture> j;

    private dbhs() {
        dbiv<Texture> dbivVar = new dbiv<>();
        this.b = dbivVar;
        dbiv<Material> dbivVar2 = new dbiv<>();
        this.c = dbivVar2;
        dbiv<dbgt> dbivVar3 = new dbiv<>();
        this.d = dbivVar3;
        dbiv<dbip> dbivVar4 = new dbiv<>();
        this.e = dbivVar4;
        dbeo<dbem> dbeoVar = new dbeo<>();
        this.f = dbeoVar;
        dbeo<dbes> dbeoVar2 = new dbeo<>();
        this.g = dbeoVar2;
        dbeo<Material> dbeoVar3 = new dbeo<>();
        this.h = dbeoVar3;
        dbeo<dbhl> dbeoVar4 = new dbeo<>();
        this.i = dbeoVar4;
        dbeo<Texture> dbeoVar5 = new dbeo<>();
        this.j = dbeoVar5;
        a(dbivVar);
        a(dbivVar2);
        a(dbivVar3);
        a(dbivVar4);
        a(dbeoVar);
        a(dbeoVar2);
        a(dbeoVar3);
        a(dbeoVar4);
        a(dbeoVar5);
    }

    public static dbhs b() {
        if (k == null) {
            k = new dbhs();
        }
        return k;
    }

    public final void a(dbit dbitVar) {
        this.a.add(dbitVar);
    }
}
