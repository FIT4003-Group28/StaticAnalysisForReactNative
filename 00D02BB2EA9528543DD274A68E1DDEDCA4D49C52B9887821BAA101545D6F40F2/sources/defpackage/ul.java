package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: ul  reason: default package */
/* loaded from: classes.dex */
public final class ul extends MenuInflater {
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class<?>[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public ul(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    private final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        ColorStateList colorStateList;
        uk ukVar = new uk(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        ukVar.a();
                    } else if (name2.equals("item")) {
                        if (!ukVar.h) {
                            nf nfVar = ukVar.A;
                            if (nfVar == null || !nfVar.f()) {
                                ukVar.h = true;
                                ukVar.b(ukVar.a.add(ukVar.b, ukVar.i, ukVar.j, ukVar.k));
                            } else {
                                ukVar.c();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                    eventType = xmlPullParser.next();
                }
                eventType = xmlPullParser.next();
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = ukVar.F.e.obtainStyledAttributes(attributeSet, sj.o);
                        ukVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        ukVar.c = obtainStyledAttributes.getInt(3, 0);
                        ukVar.d = obtainStyledAttributes.getInt(4, 0);
                        ukVar.e = obtainStyledAttributes.getInt(5, 0);
                        ukVar.f = obtainStyledAttributes.getBoolean(2, true);
                        ukVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            aeq a2 = aeq.a(ukVar.F.e, attributeSet, sj.p);
                            ukVar.i = a2.o(2, 0);
                            ukVar.j = (a2.i(5, ukVar.c) & (-65536)) | ((char) a2.i(6, ukVar.d));
                            ukVar.k = a2.f(7);
                            ukVar.l = a2.f(8);
                            ukVar.m = a2.o(0, 0);
                            ukVar.n = uk.e(a2.g(9));
                            ukVar.o = a2.i(16, 4096);
                            ukVar.p = uk.e(a2.g(10));
                            ukVar.q = a2.i(20, 4096);
                            if (a2.p(11)) {
                                ukVar.r = a2.h(11, false) ? 1 : 0;
                            } else {
                                ukVar.r = ukVar.e;
                            }
                            ukVar.s = a2.h(3, false);
                            ukVar.t = a2.h(4, ukVar.f);
                            ukVar.u = a2.h(1, ukVar.g);
                            ukVar.v = a2.i(21, -1);
                            ukVar.z = a2.g(12);
                            ukVar.w = a2.o(13, 0);
                            ukVar.x = a2.g(15);
                            ukVar.y = a2.g(14);
                            String str2 = ukVar.y;
                            if (str2 != null && ukVar.w == 0 && ukVar.x == null) {
                                ukVar.A = (nf) ukVar.d(str2, b, ukVar.F.d);
                            } else {
                                ukVar.A = null;
                            }
                            ukVar.B = a2.f(17);
                            ukVar.C = a2.f(22);
                            if (a2.p(19)) {
                                ukVar.E = ze.d(a2.i(19, -1), ukVar.E);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                ukVar.E = null;
                            }
                            if (a2.p(18)) {
                                ukVar.D = a2.j(18);
                            } else {
                                ukVar.D = colorStateList;
                            }
                            a2.q();
                            ukVar.h = false;
                        } else if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet, ukVar.c());
                        } else {
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (menu instanceof ky) {
            XmlResourceParser xmlResourceParser = null;
            try {
                try {
                    xmlResourceParser = this.e.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    if (xmlResourceParser == null) {
                        return;
                    }
                    return;
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } finally {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        }
        super.inflate(i, menu);
    }
}
