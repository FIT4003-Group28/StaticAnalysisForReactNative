package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
/* loaded from: classes.dex */
public class i extends b0 {
    private final b z = new b(null);

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5980a = new int[com.facebook.yoga.u.values().length];

        static {
            try {
                f5980a[com.facebook.yoga.u.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5980a[com.facebook.yoga.u.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5980a[com.facebook.yoga.u.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5980a[com.facebook.yoga.u.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        float f5981a;

        /* renamed from: b  reason: collision with root package name */
        com.facebook.yoga.u f5982b;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        void a(Dynamic dynamic) {
            float a2;
            com.facebook.yoga.u uVar;
            if (!dynamic.isNull()) {
                if (dynamic.getType() == ReadableType.String) {
                    String asString = dynamic.asString();
                    if (asString.equals("auto")) {
                        uVar = com.facebook.yoga.u.AUTO;
                    } else if (!asString.endsWith("%")) {
                        throw new IllegalArgumentException("Unknown value: " + asString);
                    } else {
                        this.f5982b = com.facebook.yoga.u.PERCENT;
                        a2 = Float.parseFloat(asString.substring(0, asString.length() - 1));
                    }
                } else {
                    this.f5982b = com.facebook.yoga.u.POINT;
                    a2 = q.a(dynamic.asDouble());
                }
                this.f5981a = a2;
                return;
            }
            uVar = com.facebook.yoga.u.UNDEFINED;
            this.f5982b = uVar;
            this.f5981a = Float.NaN;
        }
    }

    private int h(int i) {
        if (!com.facebook.react.modules.i18nmanager.a.a().a(i())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        return i;
    }

    @com.facebook.react.uimanager.e1.a(name = "alignContent")
    public void setAlignContent(String str) {
        com.facebook.yoga.a aVar;
        if (y()) {
            return;
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    aVar = com.facebook.yoga.a.AUTO;
                    break;
                case 1:
                    break;
                case 2:
                    aVar = com.facebook.yoga.a.CENTER;
                    break;
                case 3:
                    aVar = com.facebook.yoga.a.FLEX_END;
                    break;
                case 4:
                    aVar = com.facebook.yoga.a.STRETCH;
                    break;
                case 5:
                    aVar = com.facebook.yoga.a.BASELINE;
                    break;
                case 6:
                    aVar = com.facebook.yoga.a.SPACE_BETWEEN;
                    break;
                case 7:
                    aVar = com.facebook.yoga.a.SPACE_AROUND;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
            }
            a(aVar);
        }
        aVar = com.facebook.yoga.a.FLEX_START;
        a(aVar);
    }

    @com.facebook.react.uimanager.e1.a(name = "alignItems")
    public void setAlignItems(String str) {
        com.facebook.yoga.a aVar;
        if (y()) {
            return;
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    aVar = com.facebook.yoga.a.AUTO;
                    break;
                case 1:
                    aVar = com.facebook.yoga.a.FLEX_START;
                    break;
                case 2:
                    aVar = com.facebook.yoga.a.CENTER;
                    break;
                case 3:
                    aVar = com.facebook.yoga.a.FLEX_END;
                    break;
                case 4:
                    break;
                case 5:
                    aVar = com.facebook.yoga.a.BASELINE;
                    break;
                case 6:
                    aVar = com.facebook.yoga.a.SPACE_BETWEEN;
                    break;
                case 7:
                    aVar = com.facebook.yoga.a.SPACE_AROUND;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
            }
            b(aVar);
        }
        aVar = com.facebook.yoga.a.STRETCH;
        b(aVar);
    }

    @com.facebook.react.uimanager.e1.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        com.facebook.yoga.a aVar;
        if (y()) {
            return;
        }
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    break;
                case 1:
                    aVar = com.facebook.yoga.a.FLEX_START;
                    break;
                case 2:
                    aVar = com.facebook.yoga.a.CENTER;
                    break;
                case 3:
                    aVar = com.facebook.yoga.a.FLEX_END;
                    break;
                case 4:
                    aVar = com.facebook.yoga.a.STRETCH;
                    break;
                case 5:
                    aVar = com.facebook.yoga.a.BASELINE;
                    break;
                case 6:
                    aVar = com.facebook.yoga.a.SPACE_BETWEEN;
                    break;
                case 7:
                    aVar = com.facebook.yoga.a.SPACE_AROUND;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
            }
            c(aVar);
        }
        aVar = com.facebook.yoga.a.AUTO;
        c(aVar);
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f2) {
        e(f2);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f2) {
        if (y()) {
            return;
        }
        a(h(c1.f5886a[i]), q.b(f2));
    }

    @com.facebook.react.uimanager.e1.a(name = "collapsable")
    public void setCollapsable(boolean z) {
    }

    @com.facebook.react.uimanager.e1.a(name = "display")
    public void setDisplay(String str) {
        com.facebook.yoga.i iVar;
        if (y()) {
            return;
        }
        if (str == null) {
            a(com.facebook.yoga.i.FLEX);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3145721) {
            if (hashCode == 3387192 && str.equals("none")) {
                c2 = 1;
            }
        } else if (str.equals("flex")) {
            c2 = 0;
        }
        if (c2 == 0) {
            iVar = com.facebook.yoga.i.FLEX;
        } else if (c2 != 1) {
            throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
        } else {
            iVar = com.facebook.yoga.i.NONE;
        }
        a(iVar);
    }

    @Override // com.facebook.react.uimanager.b0
    @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f2) {
        if (y()) {
            return;
        }
        super.setFlex(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            c(this.z.f5981a);
        } else if (i == 3) {
            O();
        } else if (i == 4) {
            d(this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        com.facebook.yoga.k kVar;
        if (y()) {
            return;
        }
        if (str == null) {
            a(com.facebook.yoga.k.COLUMN);
            return;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1448970769:
                if (str.equals("row-reverse")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c2 = 0;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1272730475:
                if (str.equals("column-reverse")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            kVar = com.facebook.yoga.k.COLUMN;
        } else if (c2 == 1) {
            kVar = com.facebook.yoga.k.COLUMN_REVERSE;
        } else if (c2 == 2) {
            kVar = com.facebook.yoga.k.ROW;
        } else if (c2 != 3) {
            throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
        } else {
            kVar = com.facebook.yoga.k.ROW_REVERSE;
        }
        a(kVar);
    }

    @Override // com.facebook.react.uimanager.b0
    @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f2) {
        if (y()) {
            return;
        }
        super.setFlexGrow(f2);
    }

    @Override // com.facebook.react.uimanager.b0
    @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f2) {
        if (y()) {
            return;
        }
        super.setFlexShrink(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        com.facebook.yoga.w wVar;
        if (y()) {
            return;
        }
        if (str == null) {
            a(com.facebook.yoga.w.NO_WRAP);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1039592053) {
            if (hashCode != -749527969) {
                if (hashCode == 3657802 && str.equals("wrap")) {
                    c2 = 1;
                }
            } else if (str.equals("wrap-reverse")) {
                c2 = 2;
            }
        } else if (str.equals("nowrap")) {
            c2 = 0;
        }
        if (c2 == 0) {
            wVar = com.facebook.yoga.w.NO_WRAP;
        } else if (c2 == 1) {
            wVar = com.facebook.yoga.w.WRAP;
        } else if (c2 != 2) {
            throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
        } else {
            wVar = com.facebook.yoga.w.WRAP_REVERSE;
        }
        a(wVar);
    }

    @com.facebook.react.uimanager.e1.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            a(this.z.f5981a);
        } else if (i == 3) {
            P();
        } else if (i == 4) {
            f(this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        com.facebook.yoga.l lVar;
        if (y()) {
            return;
        }
        if (str == null) {
            a(com.facebook.yoga.l.FLEX_START);
            return;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 1;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c2 = 0;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            lVar = com.facebook.yoga.l.FLEX_START;
        } else if (c2 == 1) {
            lVar = com.facebook.yoga.l.CENTER;
        } else if (c2 == 2) {
            lVar = com.facebook.yoga.l.FLEX_END;
        } else if (c2 == 3) {
            lVar = com.facebook.yoga.l.SPACE_BETWEEN;
        } else if (c2 == 4) {
            lVar = com.facebook.yoga.l.SPACE_AROUND;
        } else if (c2 != 5) {
            throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
        } else {
            lVar = com.facebook.yoga.l.SPACE_EVENLY;
        }
        a(lVar);
    }

    @com.facebook.react.uimanager.e1.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (y()) {
            return;
        }
        int h2 = h(c1.f5887b[i]);
        this.z.a(dynamic);
        int i2 = a.f5980a[this.z.f5982b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            c(h2, this.z.f5981a);
        } else if (i2 == 3) {
            g(h2);
        } else if (i2 == 4) {
            d(h2, this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            g(this.z.f5981a);
        } else if (i == 4) {
            h(this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            i(this.z.f5981a);
        } else if (i == 4) {
            j(this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            k(this.z.f5981a);
        } else if (i == 4) {
            l(this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            m(this.z.f5981a);
        } else if (i == 4) {
            n(this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "overflow")
    public void setOverflow(String str) {
        com.facebook.yoga.s sVar;
        if (y()) {
            return;
        }
        if (str == null) {
            a(com.facebook.yoga.s.VISIBLE);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1217487446) {
            if (hashCode != -907680051) {
                if (hashCode == 466743410 && str.equals("visible")) {
                    c2 = 0;
                }
            } else if (str.equals("scroll")) {
                c2 = 2;
            }
        } else if (str.equals("hidden")) {
            c2 = 1;
        }
        if (c2 == 0) {
            sVar = com.facebook.yoga.s.VISIBLE;
        } else if (c2 == 1) {
            sVar = com.facebook.yoga.s.HIDDEN;
        } else if (c2 != 2) {
            throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
        } else {
            sVar = com.facebook.yoga.s.SCROLL;
        }
        a(sVar);
    }

    @com.facebook.react.uimanager.e1.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (y()) {
            return;
        }
        int h2 = h(c1.f5887b[i]);
        this.z.a(dynamic);
        int i2 = a.f5980a[this.z.f5982b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            e(h2, this.z.f5981a);
        } else if (i2 == 4) {
            f(h2, this.z.f5981a);
        }
        dynamic.recycle();
    }

    @com.facebook.react.uimanager.e1.a(name = "position")
    public void setPosition(String str) {
        com.facebook.yoga.t tVar;
        if (y()) {
            return;
        }
        if (str == null) {
            a(com.facebook.yoga.t.RELATIVE);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -554435892) {
            if (hashCode == 1728122231 && str.equals("absolute")) {
                c2 = 1;
            }
        } else if (str.equals("relative")) {
            c2 = 0;
        }
        if (c2 == 0) {
            tVar = com.facebook.yoga.t.RELATIVE;
        } else if (c2 != 1) {
            throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
        } else {
            tVar = com.facebook.yoga.t.ABSOLUTE;
        }
        a(tVar);
    }

    @com.facebook.react.uimanager.e1.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (y()) {
            return;
        }
        int h2 = h(new int[]{4, 5, 0, 2, 1, 3}[i]);
        this.z.a(dynamic);
        int i2 = a.f5980a[this.z.f5982b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            g(h2, this.z.f5981a);
        } else if (i2 == 4) {
            h(h2, this.z.f5981a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.b0
    @com.facebook.react.uimanager.e1.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (y()) {
            return;
        }
        this.z.a(dynamic);
        int i = a.f5980a[this.z.f5982b.ordinal()];
        if (i == 1 || i == 2) {
            b(this.z.f5981a);
        } else if (i == 3) {
            Q();
        } else if (i == 4) {
            o(this.z.f5981a);
        }
        dynamic.recycle();
    }
}
