package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ajvt  reason: default package */
/* loaded from: classes.dex */
final class ajvt extends hz {
    final /* synthetic */ anp a;

    public ajvt(anp anpVar) {
        this.a = anpVar;
    }

    @Override // defpackage.hz
    public final void i() {
        anp anpVar = this.a;
        anpVar.a.writeLock().lock();
        try {
            anpVar.b.remove(this);
        } finally {
            anpVar.a.writeLock().unlock();
        }
    }

    @Override // defpackage.hz
    public final void j() {
        Log.e("UnicodeEmojiUtils", "FontRequest for emoji failed.");
    }
}
