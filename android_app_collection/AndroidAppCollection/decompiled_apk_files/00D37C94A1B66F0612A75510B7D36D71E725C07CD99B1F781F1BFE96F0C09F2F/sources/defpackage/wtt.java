package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wtt  reason: default package */
/* loaded from: classes4.dex */
public final class wtt {
    final String a;
    final boolean b;
    final List c;
    final String d;
    final xci e;

    public wtt(String str, aika aikaVar, List list, String str2, xci xciVar) {
        this.a = str;
        boolean z = true;
        if (aikaVar != aika.VIDEO_PLAYING && aikaVar != aika.ENDED) {
            z = false;
        }
        this.b = z;
        this.c = list;
        this.d = str2;
        this.e = xciVar;
    }
}
