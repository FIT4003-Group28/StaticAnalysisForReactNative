package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ahmv  reason: default package */
/* loaded from: classes.dex */
public final class ahmv extends ahjs {
    public final ahnh e;
    public ahme f;
    public ahnl g;
    public ahnl h;
    public float i;
    private final ahoo j;
    private final azqb k;

    public ahmv(ahob ahobVar, ahoo ahooVar, azqb azqbVar) {
        super(new ahli(ahooVar.clone(), 1.0f, 1.0f));
        this.j = ahooVar;
        this.k = azqbVar;
        ahnh a = ahobVar.b.a(ahooVar.clone(), 0.0f, 4.0f);
        this.e = a;
        a.B(true, false);
        a.A(2.0f);
        a.h(17);
        a.n(0.0f, 0.1f, 0.0f);
    }

    public static ahni a(Bitmap bitmap, ahon ahonVar, ahmv ahmvVar) {
        ahni ahniVar = new ahni(bitmap, ahonVar, ahmvVar.j.clone(), ahmvVar.k);
        ahniVar.d = 0.3f;
        ahniVar.a(new ahly(ahniVar, 0.1f, 0.2f));
        return ahniVar;
    }

    public static ahon c(float f, boolean z) {
        return ahon.a(f, 4.0f, z ? ahon.b : ahon.c);
    }
}
