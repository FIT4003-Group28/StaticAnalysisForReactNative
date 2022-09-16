package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zki  reason: default package */
/* loaded from: classes4.dex */
public final class zki implements abv {
    final /* synthetic */ zkj a;

    public zki(zkj zkjVar) {
        this.a = zkjVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        zkj zkjVar = this.a;
        if (!zkjVar.m) {
            zkjVar.m = true;
            Object lI = zkjVar.lI();
            AudioSelectionActivity audioSelectionActivity = (AudioSelectionActivity) zkjVar;
            dwq dwqVar = (dwq) lI;
            audioSelectionActivity.h = dwqVar.a.cI();
            audioSelectionActivity.i = (aath) dwqVar.a.kn.get();
            audioSelectionActivity.j = (aafo) dwqVar.H.get();
        }
    }
}
