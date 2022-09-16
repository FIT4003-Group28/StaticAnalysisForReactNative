package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abht  reason: default package */
/* loaded from: classes.dex */
public final class abht implements Runnable {
    final /* synthetic */ apzg a;
    final /* synthetic */ abhw b;

    public abht(abhw abhwVar, apzg apzgVar) {
        this.b = abhwVar;
        this.a = apzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            abhu abhuVar = (abhu) this.b.c.get(((LiveChatAction.MarkChatItemAsDeletedAction) this.a.qm(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)).e);
            if (abhuVar == null) {
                return;
            }
            Object obj = abhuVar.a;
            if ((obj instanceof astc) || (obj instanceof assz) || (this.b.e.a() && (abhuVar.a instanceof astb))) {
                this.b.a.removeCallbacks(abhuVar);
                abhuVar.run();
                return;
            }
            abhuVar.d = this.a;
            ajsm ajsmVar = this.b.b;
            Object obj2 = abhuVar.a;
            ajsmVar.o(obj2, obj2);
        } else if (this.a.qn(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
            String str = ((LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) this.a.qm(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)).e;
            ArrayList arrayList = new ArrayList();
            for (abhu abhuVar2 : this.b.c.values()) {
                if (TextUtils.equals(str, abhg.k(abhuVar2.a))) {
                    Object obj3 = abhuVar2.a;
                    if (!(obj3 instanceof astc) && !(obj3 instanceof assz) && (!this.b.e.a() || !(abhuVar2.a instanceof astb))) {
                        abhuVar2.d = this.a;
                        ajsm ajsmVar2 = this.b.b;
                        Object obj4 = abhuVar2.a;
                        ajsmVar2.o(obj4, obj4);
                    } else {
                        arrayList.add(abhuVar2);
                    }
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                abhu abhuVar3 = (abhu) arrayList.get(i);
                this.b.a.removeCallbacks(abhuVar3);
                abhuVar3.run();
            }
        }
    }
}
