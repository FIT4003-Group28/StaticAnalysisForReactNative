package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
/* compiled from: PG */
/* renamed from: cow  reason: default package */
/* loaded from: classes3.dex */
public final class cow implements cif {
    private final cld a;
    private final cif b;

    public cow(cld cldVar, cif cifVar) {
        this.a = cldVar;
        this.b = cifVar;
    }

    @Override // defpackage.chn
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cic cicVar) {
        return this.b.a(new coy(((BitmapDrawable) ((cku) obj).c()).getBitmap(), this.a), file, cicVar);
    }

    @Override // defpackage.cif
    public final int b() {
        return 2;
    }
}
