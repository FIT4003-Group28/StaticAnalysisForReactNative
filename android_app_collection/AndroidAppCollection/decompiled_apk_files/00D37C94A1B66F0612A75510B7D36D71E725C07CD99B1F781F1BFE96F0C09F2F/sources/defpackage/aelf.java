package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aelf  reason: default package */
/* loaded from: classes.dex */
public final class aelf {
    public static final FormatStreamModel a;
    public final aeha b;
    public final aadd c;
    public final aegt d;
    public final afjz e;
    private final aepf f;
    private final yrj g;
    private final adzz h;
    private final afmw i;

    static {
        aopc aopcVar = (aopc) aqzx.b.createBuilder();
        Uri.Builder builder = new Uri.Builder();
        int i = aank.az;
        aopcVar.copyOnWrite();
        aqzx aqzxVar = (aqzx) aopcVar.instance;
        aqzxVar.c |= 1;
        aqzxVar.d = i;
        a = aaly.a(builder, null, 0L, aopcVar);
    }

    public aelf(aeha aehaVar, aepf aepfVar, yrj yrjVar, adzz adzzVar, afmw afmwVar, aadd aaddVar, aegt aegtVar, afjz afjzVar) {
        afms.a(aehaVar);
        this.b = aehaVar;
        afms.a(aepfVar);
        this.f = aepfVar;
        afms.a(yrjVar);
        this.g = yrjVar;
        afms.a(adzzVar);
        this.h = adzzVar;
        afms.a(afmwVar);
        this.i = afmwVar;
        afms.a(aaddVar);
        this.c = aaddVar;
        afms.a(aegtVar);
        this.d = aegtVar;
        afms.a(afjzVar);
        this.e = afjzVar;
    }

    public static List d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FormatStreamModel) it.next()).e()));
        }
        return arrayList;
    }

    public static List f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static ovm[] i(FormatStreamModel[] formatStreamModelArr) {
        int length = formatStreamModelArr.length;
        ovm[] ovmVarArr = new ovm[length];
        for (int i = 0; i < length; i++) {
            ovmVarArr[i] = ovm.d(formatStreamModelArr[i]);
        }
        return ovmVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ovm a(ovm[] ovmVarArr, PlayerConfigModel playerConfigModel, aegu aeguVar, String str, String str2) {
        afgj afgjVar = new afgj(new affp(this.f, this.g, playerConfigModel, this.h, false, this.i, aeguVar.f, adyd.f, playerConfigModel.e(), playerConfigModel.d(), str, str2, this.e, adyd.g, null, aeub.a, aetv.c), afft.a);
        ovn ovnVar = new ovn();
        afgjVar.a(Collections.emptyList(), 0L, ovmVarArr, ovnVar);
        return ovnVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aflk b(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return afll.c(videoStreamingData, playerConfigModel, this.e, afll.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aflk c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        afjz afjzVar = this.e;
        amqo amqoVar = afll.a;
        aflk c = afll.c(videoStreamingData, playerConfigModel, afjzVar, amqoVar);
        HashSet hashSet = new HashSet(c.a);
        int i = c.c;
        Set f = afll.f(afjzVar, videoStreamingData);
        Set d = afll.d(afjzVar, videoStreamingData);
        if (!afjzVar.J() && !videoStreamingData.D()) {
            hashSet.removeAll(aank.w());
            f.remove(Integer.valueOf(aank.B));
            d.remove(Integer.valueOf(aank.aw));
        }
        int i2 = 0;
        if (c.a == aank.d()) {
            if (afll.j(videoStreamingData, playerConfigModel, afjzVar, amqoVar)) {
                hashSet.addAll(f);
            }
            if (afll.g(videoStreamingData, playerConfigModel, afjzVar)) {
                hashSet.addAll(d);
            }
        } else if (c.a.equals(f)) {
            if (afll.g(videoStreamingData, playerConfigModel, afjzVar)) {
                hashSet.addAll(d);
            }
        } else if (afjzVar.f() > 0 && videoStreamingData.t && ((Boolean) amqoVar.get()).booleanValue() && afjzVar.aQ()) {
            i2 = afjzVar.f();
            hashSet.addAll(f);
        }
        return new aflk(hashSet, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        afjz afjzVar = this.e;
        amqo amqoVar = afll.d;
        aflj b = afll.b(videoStreamingData, playerConfigModel, afjzVar, amqoVar);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (videoStreamingData.D() || (afjzVar.G() && afjzVar.J())) {
            z = true;
        }
        if (afll.h(videoStreamingData, playerConfigModel, afjzVar, amqoVar) || afll.i(videoStreamingData, playerConfigModel, afjzVar)) {
            arrayList.add(Integer.valueOf(aank.W));
            arrayList.add(Integer.valueOf(aank.aP));
            arrayList.add(Integer.valueOf(playerConfigModel.aX() ? aank.V : aank.U));
            arrayList.add(Integer.valueOf(aank.aO));
            if (z) {
                arrayList.add(Integer.valueOf(aank.T));
                arrayList.add(Integer.valueOf(aank.aN));
            }
        } else if (!z) {
            b.a.remove(Integer.valueOf(aank.aN));
            arrayList.addAll(b.a);
        } else {
            arrayList.addAll(b.a);
        }
        if (afjzVar.ah()) {
            arrayList.addAll(aank.g());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set g(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return afll.b(videoStreamingData, playerConfigModel, this.e, afll.d).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        arhd a2 = this.c.a();
        if (a2 != null) {
            atdy atdyVar = a2.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            if (attvVar == null) {
                attvVar = attv.a;
            }
            attt atttVar = attvVar.g;
            if (atttVar == null) {
                atttVar = attt.b;
            }
            return atttVar.h;
        }
        return false;
    }
}
