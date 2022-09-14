package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aux  reason: default package */
/* loaded from: classes2.dex */
public final class aux {
    private static final Class<?>[] b = {Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor> c = new HashMap<>();
    public final Context a;
    private final avb e;
    private final Object[] d = new Object[2];
    private final String[] f = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public aux(Context context, avb avbVar) {
        this.a = context;
        this.e = avbVar;
    }

    private final Preference b(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        Constructor<?> constructor = c.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && (r4 = strArr.length) != 0) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                        constructor = cls.getConstructor(b);
                        constructor.setAccessible(true);
                        c.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(b);
                    constructor.setAccessible(true);
                    c.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        Object[] objArr = this.d;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private final Preference c(String str, AttributeSet attributeSet) {
        try {
            if (str.indexOf(46) == -1) {
                return b(str, this.f, attributeSet);
            }
            return b(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    private final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                }
                next = 3;
            }
            if (next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.r = Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        this.a.getResources().parseBundleExtra("extra", attributeSet, preference.q());
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                                }
                            }
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e2);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference c2 = c(name, attributeSet);
                        ((PreferenceGroup) preference).aj(c2);
                        d(xmlPullParser, c2, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Preference a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        synchronized (this.d) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.d[0] = this.a;
            while (true) {
                try {
                    try {
                        try {
                            int next = xmlPullParser.next();
                            if (next == 2) {
                                PreferenceGroup preferenceGroup2 = (PreferenceGroup) c(xmlPullParser.getName(), asAttributeSet);
                                if (preferenceGroup == null) {
                                    preferenceGroup2.M(this.e);
                                    preferenceGroup = preferenceGroup2;
                                }
                                d(xmlPullParser, preferenceGroup, asAttributeSet);
                            } else if (next == 1) {
                                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                            }
                        } catch (InflateException e) {
                            throw e;
                        }
                    } catch (XmlPullParserException e2) {
                        InflateException inflateException = new InflateException(e2.getMessage());
                        inflateException.initCause(e2);
                        throw inflateException;
                    }
                } catch (IOException e3) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            }
        }
        return preferenceGroup;
    }
}
