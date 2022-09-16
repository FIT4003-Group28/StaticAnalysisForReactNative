package defpackage;

import java.util.Deque;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: PG */
/* renamed from: zid  reason: default package */
/* loaded from: classes4.dex */
final class zid extends DefaultHandler {
    public Object a;
    private final zib b;
    private final Deque c;
    private final Deque d;
    private final Deque e;
    private final Deque f;

    public zid(zib zibVar) {
        this.b = zibVar;
        LinkedList linkedList = new LinkedList();
        this.d = linkedList;
        linkedList.offerFirst("");
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.c = new LinkedList();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.b.d((String) this.d.peekFirst()) != null) {
            ((StringBuilder) this.f.peekFirst()).append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        zna d = this.b.d((String) this.d.pollFirst());
        if (d != null) {
            Attributes attributes = (Attributes) this.e.pollFirst();
            String sb = ((StringBuilder) this.f.pollFirst()).toString();
            Object peekFirst = this.c.peekFirst();
            if (peekFirst == null) {
                peekFirst = this.a;
            }
            this.a = peekFirst;
            d.n(this.c, attributes, sb);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4 = (String) this.d.peekFirst();
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str3).length());
        sb.append(str4);
        sb.append("/");
        sb.append(str3);
        String sb2 = sb.toString();
        this.d.offerFirst(sb2);
        zna d = this.b.d(sb2);
        if (d != null) {
            this.e.offerFirst(attributes != null ? new AttributesImpl(attributes) : zie.a);
            this.f.offerFirst(new StringBuilder());
            d.o(this.c, attributes);
        }
    }
}
