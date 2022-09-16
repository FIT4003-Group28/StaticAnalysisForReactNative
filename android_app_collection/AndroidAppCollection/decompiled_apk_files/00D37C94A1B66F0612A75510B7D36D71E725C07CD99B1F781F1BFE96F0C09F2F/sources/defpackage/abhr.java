package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: abhr  reason: default package */
/* loaded from: classes.dex */
public class abhr extends abhc {
    public final Handler c;
    public final Queue d;
    public long e;
    public long f;
    private long g;
    private final Runnable h;

    public abhr(Handler handler, abha abhaVar, abgz abgzVar) {
        super(abhaVar, abgzVar);
        this.d = new ArrayDeque();
        this.e = 224L;
        this.h = new abhp(this);
        this.c = handler;
    }

    @Override // defpackage.abhc
    public void a(List list, long j) {
        abhg abhgVar = ((abiq) this.a).b;
        boolean z = false;
        if (abhgVar == null || abhgVar.a() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            String str = null;
            while (it.hasNext()) {
                apzg apzgVar = (apzg) it.next();
                if (apzgVar.qn(LiveChatAction.AddChatItemAction.addChatItemAction)) {
                    LiveChatAction.AddChatItemAction addChatItemAction = (LiveChatAction.AddChatItemAction) apzgVar.qm(LiveChatAction.AddChatItemAction.addChatItemAction);
                    if (addChatItemAction.d.isEmpty()) {
                        asqy asqyVar = addChatItemAction.c;
                        if (asqyVar == null) {
                            asqyVar = asqy.a;
                        }
                        str = abhg.l(asqyVar);
                    } else {
                        str = addChatItemAction.d;
                    }
                } else if (!apzgVar.qn(LiveChatAction.AddLiveChatTextMessageFromTemplateAction.addLiveChatTextMessageFromTemplateAction)) {
                    if (apzgVar.qn(LiveChatAction.RemoveChatItemAction.removeChatItemAction)) {
                        str = ((LiveChatAction.RemoveChatItemAction) apzgVar.qm(LiveChatAction.RemoveChatItemAction.removeChatItemAction)).b;
                    } else if (apzgVar.qn(LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction)) {
                        asta astaVar = ((LiveChatAction.AddLiveChatTickerItemAction) apzgVar.qm(LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction)).c;
                        if (astaVar == null) {
                            astaVar = asta.a;
                        }
                        int i = astaVar.b;
                        if (i == 132600952) {
                            str = ((astb) astaVar.c).c;
                        } else if (i == 132600924) {
                            str = ((astc) astaVar.c).c;
                        } else {
                            str = i == 201730354 ? ((assz) astaVar.c).b : null;
                        }
                    } else if (apzgVar.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
                        str = ((LiveChatAction.MarkChatItemAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)).e;
                    } else {
                        apzgVar.qn(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
                    }
                }
                abhq abhqVar = (abhq) linkedHashMap.get(str);
                if (abhqVar == null) {
                    abhqVar = new abhq(new ArrayList());
                    linkedHashMap.put(str, abhqVar);
                }
                abhqVar.a.add(apzgVar);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                this.d.add((abhq) entry.getValue());
            }
            if (j == 0) {
                j = 500;
            }
            int size = this.d.size();
            if (size <= 0) {
                return;
            }
            long max = Math.max(1L, ((j + 15) / size) / 16);
            long min = Math.min(Math.max(7L, max), 30L);
            this.f = Math.max(1L, (long) Math.ceil(min / max));
            this.e = min * 16;
            abgz abgzVar = this.a;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= this.g) {
                abkq abkqVar = ((abiq) abgzVar).e;
                if (abkqVar != null) {
                    if (max >= 14) {
                        z = true;
                    }
                    abkqVar.g(z);
                }
                this.g = currentTimeMillis + 60000;
            }
            if (size != linkedHashMap.size()) {
                return;
            }
            this.c.post(this.h);
            return;
        }
        this.b.a(list, this.a, false);
        abhgVar.v();
    }

    public final void h(abhq abhqVar) {
        this.b.a(abhqVar.a, this.a, true);
    }

    @Override // defpackage.abhc, defpackage.abrg
    public void mU() {
        this.c.removeCallbacks(this.h);
        while (!this.d.isEmpty()) {
            h((abhq) this.d.remove());
        }
    }

    @Override // defpackage.abhc, defpackage.abrg
    public void mW() {
        this.g = 0L;
    }

    @Override // defpackage.abhc, defpackage.abrg
    public void mX() {
        this.c.removeCallbacks(this.h);
        this.d.clear();
    }
}
