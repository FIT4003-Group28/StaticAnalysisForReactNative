package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: anqx  reason: default package */
/* loaded from: classes.dex */
public class anqx {
    private static alrl a;

    public static int b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            if (i == 4) {
                return 6;
            }
            return i != 5 ? 0 : 7;
        }
        return 2;
    }

    public static int d(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 5;
            }
            if (i == 4) {
                return 6;
            }
            return i != 5 ? 0 : 7;
        }
        return 2;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            return i != 2 ? 0 : 4;
        }
        return 2;
    }

    public static int g(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 4;
            }
            return i != 3 ? 0 : 5;
        }
        return 2;
    }

    public static alvd i(Exception exc) {
        alvd alvdVar = new alvd(null);
        synchronized (alvdVar.a) {
            alvdVar.a();
            alvdVar.c = true;
            alvdVar.e = exc;
        }
        alvdVar.b.b(alvdVar);
        return alvdVar;
    }

    public static alvd j(Object obj) {
        alvd alvdVar = new alvd(null);
        synchronized (alvdVar.a) {
            alvdVar.a();
            alvdVar.c = true;
            alvdVar.d = obj;
        }
        alvdVar.b.b(alvdVar);
        return alvdVar;
    }

    public static altf k(XmlPullParser xmlPullParser, alte alteVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String n = n("name", xmlPullParser);
                                    if (n != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String n2 = n("key", xmlPullParser);
                                                                String n3 = n("split", xmlPullParser);
                                                                o(xmlPullParser);
                                                                if (n2 != null && n3 != null) {
                                                                    if (!alteVar.a.containsKey(n2)) {
                                                                        alteVar.a.put(n2, new HashMap());
                                                                    }
                                                                    ((Map) alteVar.a.get(n2)).put(n, n3);
                                                                }
                                                            } else {
                                                                o(xmlPullParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    o(xmlPullParser);
                                                }
                                            }
                                        }
                                    } else {
                                        o(xmlPullParser);
                                    }
                                } else {
                                    o(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        o(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : alteVar.a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new altf(Collections.unmodifiableMap(hashMap));
    }

    public static synchronized alrl l(Context context) {
        alrl alrlVar;
        synchronized (anqx.class) {
            if (a == null) {
                alrk alrkVar = new alrk();
                alrkVar.a = new alra(akpq.m(context));
                axzl.n(alrkVar.a, alra.class);
                a = new alrl(alrkVar.a);
            }
            alrlVar = a;
        }
        return alrlVar;
    }

    public static RectF m(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.t || !(view instanceof alox)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        alox aloxVar = (alox) view;
        View[] viewArr = {aloxVar.a, aloxVar.b, null};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {aloxVar.a, aloxVar.b, null};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int t = (int) amyv.t(aloxVar.getContext(), 24);
        if (i4 < t) {
            i4 = t;
        }
        int left = (aloxVar.getLeft() + aloxVar.getRight()) / 2;
        int top = (aloxVar.getTop() + aloxVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF(left - i9, top - (i8 / 2), i9 + left, top + (left / 2));
    }

    private static String n(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static void o(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF m = m(tabLayout, view);
        RectF m2 = m(tabLayout, view2);
        drawable.setBounds(alhv.c((int) m.left, (int) m2.left, f), drawable.getBounds().top, alhv.c((int) m.right, (int) m2.right, f), drawable.getBounds().bottom);
    }
}
