package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Deque;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: aixf  reason: default package */
/* loaded from: classes.dex */
final class aixf extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        deque.pop();
    }

    @Override // defpackage.zna
    public final void o(Deque deque, Attributes attributes) {
        long j;
        aiwz b = aixn.b(deque);
        if (b == null) {
            return;
        }
        try {
            j = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS").parse(attributes.getValue("yt:segmentIngestTime")).getTime();
        } catch (ParseException unused) {
            j = 0;
        }
        b.a = pcx.h(attributes.getValue("start"));
        b.b = j;
    }
}
