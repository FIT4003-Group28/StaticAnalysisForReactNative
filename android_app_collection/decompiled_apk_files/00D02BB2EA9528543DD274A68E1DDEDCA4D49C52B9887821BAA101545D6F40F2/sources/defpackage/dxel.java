package defpackage;

import java.util.HashMap;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* compiled from: PG */
/* renamed from: dxel  reason: default package */
/* loaded from: classes6.dex */
final class dxel extends DefaultHandler {
    final HashMap<String, String> a = new HashMap<>();
    final Stack<dxek> b = new Stack<>();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (this.b.size() > 0) {
            dxek lastElement = this.b.lastElement();
            lastElement.c.append("</");
            lastElement.c.append(str2);
            lastElement.c.append(">");
            int i = lastElement.b - 1;
            lastElement.b = i;
            if (i != 0) {
                return;
            }
            String sb = lastElement.c.toString();
            this.a.put(lastElement.a, sb);
            this.b.pop();
            if (this.b.size() <= 0) {
                return;
            }
            this.b.lastElement().c.append(sb);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        String value = attributes.getValue("id");
        if (value != null) {
            this.b.push(new dxek(value));
        }
        if (this.b.size() > 0) {
            dxek lastElement = this.b.lastElement();
            lastElement.b++;
            StringBuilder sb = lastElement.c;
            sb.append("<");
            sb.append(str2);
            for (int i = 0; i < attributes.getLength(); i++) {
                sb.append(" ");
                sb.append(attributes.getQName(i));
                sb.append("='");
                sb.append(dxer.b(attributes.getValue(i)));
                sb.append("'");
            }
            sb.append(">");
        }
    }
}
