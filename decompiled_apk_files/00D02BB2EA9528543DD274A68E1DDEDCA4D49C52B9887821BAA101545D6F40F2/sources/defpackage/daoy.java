package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: daoy  reason: default package */
/* loaded from: classes5.dex */
final class daoy {
    public static final daox a(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return b(xml, context);
        } finally {
            xml.close();
        }
    }

    private static final daox b(XmlPullParser xmlPullParser, Context context) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!xmlPullParser.getName().equals("FooterButton")) {
                        throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": not a FooterButton"));
                    }
                    return new daox(context, asAttributeSet);
                } else if (next == 1) {
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": No start tag found!"));
                }
            } catch (IOException e) {
                String positionDescription = xmlPullParser.getPositionDescription();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 2 + String.valueOf(message).length());
                sb.append(positionDescription);
                sb.append(": ");
                sb.append(message);
                throw new InflateException(sb.toString(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        }
    }
}
