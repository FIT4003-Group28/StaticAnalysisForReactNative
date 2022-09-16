package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: avg  reason: default package */
/* loaded from: classes2.dex */
public final class avg {
    public final Format a;
    public final amuk b;
    public final long c;
    public final avf d;
    public final Uri e;
    public final String f;
    public final avf g;
    public final avi h;

    public avg(Format format, List list, avh avhVar, List list2, String str, long j) {
        ptx.c(!list.isEmpty());
        this.a = format;
        this.b = amuk.o(list);
        if (list2 == null) {
            Collections.emptyList();
        } else {
            Collections.unmodifiableList(list2);
        }
        this.d = avhVar.a;
        this.c = pxi.n(0L, 1000000L, 1L);
        this.e = Uri.parse(((avd) list.get(0)).a);
        long j2 = avhVar.c;
        avi aviVar = null;
        avf avfVar = j2 <= 0 ? null : new avf(null, avhVar.b, j2);
        this.g = avfVar;
        this.f = str;
        this.h = avfVar == null ? new avi(new avf(null, 0L, j)) : aviVar;
    }
}
