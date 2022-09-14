package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bzap  reason: default package */
/* loaded from: classes4.dex */
public final class bzap implements dbty<Drawable> {
    public final int a;
    public final float b;
    @dzsi
    public final String c;
    public final boolean d;
    public final vtn e;
    public final Resources f;

    public bzap(float f, int i, @dzsi String str, boolean z, vtn vtnVar, Resources resources) {
        this.b = f;
        this.a = i;
        this.c = str;
        this.d = z;
        this.e = vtnVar;
        this.f = resources;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Drawable a() {
        return new bzao(this);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzap)) {
            return false;
        }
        bzap bzapVar = (bzap) obj;
        return Float.compare(bzapVar.b, this.b) == 0 && this.a == bzapVar.a && dbsd.a(this.c, bzapVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Integer.valueOf(this.a), this.c});
    }
}
