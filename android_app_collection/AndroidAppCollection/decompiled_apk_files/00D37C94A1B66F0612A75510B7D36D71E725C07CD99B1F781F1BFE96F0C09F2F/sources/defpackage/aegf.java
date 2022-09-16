package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: aegf  reason: default package */
/* loaded from: classes.dex */
public final class aegf extends owh {
    private String a;
    private String b;
    private boolean c;
    private String d;
    private String e;
    private long f;
    private long g;
    private List h;

    public aegf(String str) {
        super(str);
    }

    @Override // defpackage.owh
    protected final Pair f(XmlPullParser xmlPullParser, String str, long j) {
        try {
            this.f = t(xmlPullParser, "yt:segmentIngestTime");
        } catch (ParseException unused) {
            this.f = -1L;
        }
        this.h = new ArrayList();
        return super.f(xmlPullParser, str, j);
    }

    @Override // defpackage.owh
    protected final ovm g(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        return new ovm(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    @Override // defpackage.owh
    protected final owc h(XmlPullParser xmlPullParser, String str, ows owsVar) {
        this.a = xmlPullParser.getAttributeValue(null, "yt:audioContentID");
        this.b = xmlPullParser.getAttributeValue(null, "yt:langName");
        this.c = false;
        this.d = xmlPullParser.getAttributeValue(null, "yt:projectionType");
        this.e = xmlPullParser.getAttributeValue(null, "yt:stereoLayout");
        return super.h(xmlPullParser, str, owsVar);
    }

    @Override // defpackage.owh
    protected final owd i(XmlPullParser xmlPullParser) {
        SparseArray sparseArray = new SparseArray();
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "yt:SystemURL")) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
                if ("widevine".equals(attributeValue2)) {
                    xmlPullParser.next();
                    sparseArray.put(4, xmlPullParser.getText());
                } else if ("playready".equals(attributeValue2)) {
                    xmlPullParser.next();
                    sparseArray.put(5, xmlPullParser.getText());
                }
            }
        } while (!pcu.a(xmlPullParser, "ContentProtection"));
        return new aegd(attributeValue, sparseArray);
    }

    @Override // defpackage.owh
    protected final owp l(XmlPullParser xmlPullParser, owp owpVar) {
        this.g = e(xmlPullParser, "presentationTimeOffset", 0L);
        return super.l(xmlPullParser, owpVar);
    }

    @Override // defpackage.owh
    protected final List o(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "S")) {
                j = e(xmlPullParser, "t", j);
                long j2 = j - this.g;
                long e = e(xmlPullParser, "yt:cuepointTimeOffset", Long.MIN_VALUE);
                aesp aespVar = null;
                if (e != Long.MIN_VALUE) {
                    long e2 = e(xmlPullParser, "yt:cuepointDuration", Long.MIN_VALUE);
                    if (e2 != Long.MIN_VALUE) {
                        aespVar = new aesp(n(xmlPullParser, "yt:cuepointIdentifier", null), n(xmlPullParser, "yt:cuepointEvent", null), j2, e, e2, n(xmlPullParser, "yt:cuepointContext", null));
                    }
                }
                if (aespVar != null) {
                    this.h.add(aespVar);
                }
                long u = u(xmlPullParser);
                int c = c(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < c; i++) {
                    arrayList.add(q(j, u));
                    j += u;
                }
            }
        } while (!pcu.a(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    @Override // defpackage.owh
    protected final void p(XmlPullParser xmlPullParser) {
        if (!pcu.c(xmlPullParser, "Role") || !"main".equals(xmlPullParser.getAttributeValue(null, "value"))) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.owh
    protected final owc y(int i, List list, List list2) {
        return new aegc(i, list, list2, this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.owh
    protected final owi z(long j, List list) {
        for (aesp aespVar : this.h) {
            aespVar.f = j;
        }
        return new aege(j, list, this.f);
    }
}
