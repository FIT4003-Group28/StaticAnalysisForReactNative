package defpackage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.google.android.filament.R;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
/* compiled from: PG */
/* renamed from: dxer  reason: default package */
/* loaded from: classes.dex */
public final class dxer {
    public static dxee a(Resources resources, int i) {
        return f(resources.openRawResource(i), 0, 0, false);
    }

    public static String b(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;");
    }

    public static dxem c(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (!z) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                    case 'h':
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                    case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                    case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        String substring = str.substring(i, i2);
                        if (substring.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                        }
                        return new dxem(arrayList);
                    case '\t':
                    case '\n':
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() <= 0) {
                            i++;
                            break;
                        } else {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                            if (charAt == '-') {
                                i = i2;
                                break;
                            } else {
                                i = i2 + 1;
                                z = true;
                                continue;
                            }
                        }
                }
            }
            z = false;
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
        }
        return new dxem(arrayList);
    }

    public static Matrix d(String str) {
        float f;
        int i;
        Matrix matrix = new Matrix();
        while (true) {
            float f2 = 0.0f;
            if (str.startsWith("matrix(")) {
                dxem c = c(str.substring(7));
                if (c.a.size() == 6) {
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{c.a.get(0).floatValue(), c.a.get(2).floatValue(), c.a.get(4).floatValue(), c.a.get(1).floatValue(), c.a.get(3).floatValue(), c.a.get(5).floatValue(), 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                }
            } else if (str.startsWith("translate(")) {
                dxem c2 = c(str.substring(10));
                if (c2.a.size() > 0) {
                    float floatValue = c2.a.get(0).floatValue();
                    if (c2.a.size() > 1) {
                        f2 = c2.a.get(1).floatValue();
                    }
                    matrix.preTranslate(floatValue, f2);
                }
            } else if (str.startsWith("scale(")) {
                dxem c3 = c(str.substring(6));
                if (c3.a.size() > 0) {
                    float floatValue2 = c3.a.get(0).floatValue();
                    matrix.preScale(floatValue2, c3.a.size() > 1 ? c3.a.get(1).floatValue() : floatValue2);
                }
            } else if (str.startsWith("skewX(")) {
                dxem c4 = c(str.substring(6));
                if (c4.a.size() > 0) {
                    matrix.preSkew((float) Math.tan(c4.a.get(0).floatValue()), 0.0f);
                }
            } else if (str.startsWith("skewY(")) {
                dxem c5 = c(str.substring(6));
                if (c5.a.size() > 0) {
                    matrix.preSkew(0.0f, (float) Math.tan(c5.a.get(0).floatValue()));
                }
            } else if (str.startsWith("rotate(")) {
                dxem c6 = c(str.substring(7));
                if (c6.a.size() > 0) {
                    float floatValue3 = c6.a.get(0).floatValue();
                    if (c6.a.size() > 2) {
                        f2 = c6.a.get(1).floatValue();
                        f = c6.a.get(2).floatValue();
                    } else {
                        f = 0.0f;
                    }
                    matrix.preTranslate(f2, f);
                    matrix.preRotate(floatValue3);
                    matrix.preTranslate(-f2, -f);
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20);
                sb.append("Invalid transform (");
                sb.append(str);
                sb.append(")");
                sb.toString();
            }
            int indexOf = str.indexOf(")");
            if (indexOf <= 0 || str.length() <= (i = indexOf + 1)) {
                break;
            }
            str = str.substring(i).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    public static String e(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static dxee f(InputStream inputStream, Integer num, Integer num2, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            Picture picture = new Picture();
            dxep dxepVar = new dxep(picture);
            dxepVar.p = num;
            dxepVar.q = num2;
            dxepVar.r = 72.0f;
            if (z) {
                xMLReader.setContentHandler(dxepVar);
                xMLReader.parse(new InputSource(inputStream));
            } else {
                dxei dxeiVar = new dxei(inputStream);
                dxel dxelVar = new dxel();
                xMLReader.setContentHandler(dxelVar);
                xMLReader.parse(new InputSource(dxeiVar.a()));
                dxepVar.a = dxelVar.a;
                xMLReader.setContentHandler(dxepVar);
                xMLReader.parse(new InputSource(dxeiVar.a()));
            }
            StringBuilder sb = new StringBuilder(48);
            sb.append("Parsing complete in ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" millis.");
            sb.toString();
            dxee dxeeVar = new dxee(picture);
            float f = dxepVar.o.top;
            return dxeeVar;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb2.append("Parse error: ");
            sb2.append(valueOf);
            sb2.toString();
            throw new dxeg(e);
        }
    }
}
