package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ajpm  reason: default package */
/* loaded from: classes.dex */
public final class ajpm implements ajmx {
    private final ajoy a;

    public static ajpm a(yni yniVar, ajmy ajmyVar, akcq akcqVar, int i, int i2, int i3, boolean z, acvh acvhVar, boolean z2, boolean z3, akvm akvmVar) {
        if (i2 <= 0 || i3 < 0) {
            return null;
        }
        ajpm ajpmVar = new ajpm(yniVar, ajmyVar, akcqVar, i, i2, i3, z, acvhVar, z2, z3, akvmVar);
        ajpmVar.a.k();
        return ajpmVar;
    }

    @Override // defpackage.ajmx
    public final void b(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        this.a.b(imageView, ajmuVar, avhnVar);
    }

    @Override // defpackage.ajmx
    public final void c(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        this.a.c(imageView, ajmuVar, avhnVar);
    }

    @Override // defpackage.ajmx
    public final void d(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        this.a.d(imageView, ajmuVar, avhnVar);
    }

    @Override // defpackage.ajmx
    public final void e(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        this.a.e(imageView, ajmuVar, avhnVar);
    }

    public final void f() {
        this.a.l();
    }

    private ajpm(yni yniVar, ajmy ajmyVar, akcq akcqVar, int i, int i2, int i3, boolean z, acvh acvhVar, boolean z2, boolean z3, akvm akvmVar) {
        ajoy ajpbVar;
        if (!z || acvhVar == null) {
            ajpbVar = new ajpb(ajmyVar, akcqVar, i, i2, i3, z2, z3, akvmVar, yniVar);
        } else {
            ajpbVar = new ajpi(ajmyVar, akcqVar, i, i2, i3, z2, z3, akvmVar, acvhVar);
        }
        this.a = ajpbVar;
    }
}
