package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aixz  reason: default package */
/* loaded from: classes.dex */
public final class aixz implements afwf {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public aiya f;
    public aiyc g;
    private final HashMap h;

    public aixz() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        HashMap hashMap3 = new HashMap();
        this.c = hashMap3;
        this.d = new HashMap();
        this.h = new HashMap();
        this.e = new ArrayList();
        new aiyc().b = 0;
        new aiyf().b = 0;
        new aiye().b = 0;
        hashMap.put(0, new aiyc());
        hashMap2.put(0, new aiyf());
        hashMap3.put(0, new aiye());
    }

    @Override // defpackage.afwf
    /* renamed from: b */
    public final aixy a() {
        ArrayList arrayList = new ArrayList();
        for (aiyj aiyjVar : this.h.values()) {
            arrayList.add(aiyjVar.a());
        }
        return new aixy(arrayList);
    }

    public final aiyc c(int i) {
        return (aiyc) zew.H(this.a, Integer.valueOf(i), aiyc.a);
    }

    public final aiyd d(int i) {
        return (aiyd) this.d.get(Integer.valueOf(i));
    }

    public final aiye e(int i) {
        return (aiye) zew.H(this.c, Integer.valueOf(i), aiye.a);
    }

    public final aiyf f(int i) {
        return (aiyf) zew.H(this.b, Integer.valueOf(i), aiyf.a);
    }

    public final void g(aiya aiyaVar) {
        int i = aiyaVar.f.b;
        HashMap hashMap = this.h;
        Integer valueOf = Integer.valueOf(i);
        aiyj aiyjVar = (aiyj) hashMap.get(valueOf);
        if (aiyjVar == null) {
            aiyjVar = new aiyj(i);
            this.h.put(valueOf, aiyjVar);
        }
        if (aiyaVar.d) {
            String str = aiyaVar.k;
            int i2 = (int) aiyaVar.a;
            aiyjVar.c(str, i2, ((int) aiyaVar.b) + i2);
        } else {
            String str2 = aiyaVar.k;
            int i3 = (int) aiyaVar.a;
            aiyjVar.d(str2, i3, ((int) aiyaVar.b) + i3);
        }
        int i4 = (int) aiyaVar.a;
        aiye aiyeVar = aiyaVar.f;
        int i5 = 0;
        aiyjVar.e(i4, new SubtitleWindowSettings(aiyeVar.c, aiyeVar.e, aiyeVar.d, true, aiyaVar.g.c == 2));
        if (!aiyaVar.j.isEmpty()) {
            ArrayList arrayList = aiyaVar.j;
            int size = arrayList.size();
            aiyb aiybVar = null;
            while (i5 < size) {
                aiyb aiybVar2 = (aiyb) arrayList.get(i5);
                if (aiybVar != null) {
                    String str3 = aiybVar.b;
                    long j = aiyaVar.a;
                    aiyjVar.c(str3, (int) (aiybVar.a + j), (int) (j + aiyaVar.b));
                }
                i5++;
                aiybVar = aiybVar2;
            }
            if (aiybVar == null) {
                return;
            }
            String str4 = aiybVar.b;
            long j2 = aiyaVar.a;
            aiyjVar.c(str4, (int) (aiybVar.a + j2), (int) (j2 + aiyaVar.b));
        }
    }
}
