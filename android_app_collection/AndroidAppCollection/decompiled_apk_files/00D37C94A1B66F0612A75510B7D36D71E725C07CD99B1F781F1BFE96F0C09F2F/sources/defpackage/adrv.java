package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adrv  reason: default package */
/* loaded from: classes.dex */
public final class adrv implements abv {
    final /* synthetic */ adrw a;

    public adrv(adrw adrwVar) {
        this.a = adrwVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        adrw adrwVar = this.a;
        if (!adrwVar.a) {
            adrwVar.a = true;
            Object lI = adrwVar.lI();
            MdxSmartRemoteActivity mdxSmartRemoteActivity = (MdxSmartRemoteActivity) adrwVar;
            dwq dwqVar = (dwq) lI;
            mdxSmartRemoteActivity.c = dwqVar.a.cI();
            mdxSmartRemoteActivity.d = (akdr) dwqVar.a.yY.get();
            mdxSmartRemoteActivity.g = new akdy();
        }
    }
}
