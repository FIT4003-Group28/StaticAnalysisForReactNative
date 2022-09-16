package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahgb  reason: default package */
/* loaded from: classes.dex */
public class ahgb {
    private final int a;
    private final long b;
    private final long c;
    private ahfz d;
    private ahga e;
    private final boolean f;
    private final boolean g;

    public ahgb(aeui aeuiVar, aeui aeuiVar2, FormatStreamModel formatStreamModel, long j, long j2) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.C();
        this.g = formatStreamModel.P();
        this.c = j2;
        this.b = j;
        if (aeuiVar != null) {
            this.d = new ahfz(this, aeuiVar);
        }
        if (aeuiVar2 != null) {
            this.e = new ahga(this, aeuiVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List i(aeui aeuiVar, String str) {
        List arrayList = new ArrayList();
        String d = aeuiVar.d(str);
        if (d != null) {
            arrayList = amqf.d(",").h(d);
        }
        return arrayList.subList(0, arrayList.size() - 1);
    }

    private static boolean j(aeui aeuiVar) {
        return aeuiVar.a.equals("http://youtube.com/streaming/metadata/segment/102015");
    }

    private static boolean k(aeui aeuiVar) {
        return aeuiVar.a.equals("http://youtube.com/streaming/metadata/streamer/092019");
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public ahfz d() {
        return this.d;
    }

    public ahga e() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public ahgb(aeui[] aeuiVarArr, FormatStreamModel formatStreamModel, long j, long j2) {
        this.a = formatStreamModel.e();
        this.f = formatStreamModel.C();
        this.g = formatStreamModel.P();
        this.b = j;
        this.c = j2;
        for (aeui aeuiVar : aeuiVarArr) {
            if (j(aeuiVar)) {
                this.d = new ahfz(this, aeuiVar);
            } else if (k(aeuiVar)) {
                this.e = new ahga(this, aeuiVar);
            }
        }
    }
}
