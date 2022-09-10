package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zti  reason: default package */
/* loaded from: classes7.dex */
public final class zti implements cqkv {
    final zth a;
    final cqlg b;

    public zti(zth zthVar, cqlg cqlgVar) {
        this.a = zthVar;
        this.b = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        Object obj2;
        View view = cqjzVar.c;
        if (cqkuVar instanceof ztg) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            ztg ztgVar = ztg.ARRIVAL_STOP_ICON;
            switch (((ztg) cqkuVar).ordinal()) {
                case 0:
                    if ((view instanceof ztx) && (obj == null || (obj instanceof jhk))) {
                        ((ztx) view).setArrivalStopIcon((jhk) obj);
                        return true;
                    }
                    break;
                case 1:
                    if (view instanceof zud) {
                        if (obj instanceof cqsn) {
                            ((zud) view).setBadgeText(this.b.a(view, (cqsn) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zud) view).setBadgeText(this.b.b(view, ((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null || (obj instanceof CharSequence)) {
                            ((zud) view).setBadgeText((CharSequence) obj);
                            return true;
                        }
                    }
                    break;
                case 2:
                    if (view instanceof ztz) {
                        if (obj instanceof cqss) {
                            ((ztz) view).setCircleColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((ztz) view).setCircleColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.w(null);
                            ((ztz) view).setCircleColor(null);
                            return true;
                        }
                    }
                    if (view instanceof zuc) {
                        boolean z = obj instanceof cqss;
                        if (z) {
                            ((zuc) view).setCircleColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z2 = obj instanceof Number;
                        if (z2) {
                            ((zuc) view).setCircleColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z2) {
                            this.b.w((Number) obj);
                            ((zuc) view).setCircleColor(null);
                            return true;
                        } else if (z) {
                            ((zuc) view).setCircleColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    break;
                case 3:
                    if (view instanceof zxc) {
                        if (obj instanceof cqsn) {
                            ((zxc) view).setContentDescriptionPrefix(this.b.a(view, (cqsn) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zxc) view).setContentDescriptionPrefix(this.b.b(view, ((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null || (obj instanceof CharSequence)) {
                            ((zxc) view).setContentDescriptionPrefix((CharSequence) obj);
                            return true;
                        }
                    }
                    break;
                case 4:
                    if ((view instanceof ztx) && (obj == null || (obj instanceof jhk))) {
                        ((ztx) view).setDepartureStopIcon((jhk) obj);
                        return true;
                    }
                    break;
                case 5:
                    if (view instanceof zxb) {
                        if (obj instanceof cqtv) {
                            ((zxb) view).setDesiredCompoundDrawablePadding(this.b.i(view, (cqtv) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zxb) view).setDesiredCompoundDrawablePadding(((Integer) obj).intValue());
                            return true;
                        }
                    }
                    break;
                case 6:
                    if ((view instanceof zub) && (obj == null || (obj instanceof Integer))) {
                        ((zub) view).setDestinationStopIndex((Integer) obj);
                        return true;
                    }
                    break;
                case 7:
                    boolean z3 = view instanceof ztx;
                    if (!z3 || (obj != null && !(obj instanceof jhk))) {
                        if (!z3 || !(obj instanceof cqtd)) {
                            if ((view instanceof zxb) && (obj == null || (obj instanceof jhk))) {
                                ((zxb) view).setDirectionsIcon((jhk) obj);
                                return true;
                            }
                        } else {
                            ((ztx) view).setDirectionsIcon((cqtd) obj);
                            return true;
                        }
                    } else {
                        ((ztx) view).setDirectionsIcon((jhk) obj);
                        return true;
                    }
                    break;
                case 8:
                    if (view instanceof zxb) {
                        boolean z4 = obj instanceof cqtv;
                        if (z4) {
                            ((zxb) view).setDirectionsIconSize(Integer.valueOf(this.b.j(view, (cqtv) obj)));
                            return true;
                        }
                        boolean z5 = obj instanceof Integer;
                        if (!z5) {
                            if (obj == null) {
                                this.b.x(null);
                            }
                            if (!z4) {
                                if (!z5) {
                                    if (obj == null) {
                                        this.b.x(null);
                                    }
                                    if (obj == null) {
                                        this.b.x(null);
                                    }
                                    if (obj != null) {
                                        obj2 = obj;
                                    } else {
                                        this.b.x(null);
                                        obj2 = null;
                                    }
                                    if (obj == null) {
                                        this.b.x(null);
                                        obj = null;
                                        break;
                                    } else {
                                        obj = obj2;
                                        break;
                                    }
                                } else {
                                    ((zxb) view).setDirectionsIconSize(Integer.valueOf(((Integer) obj).intValue()));
                                    return true;
                                }
                            } else {
                                ((zxb) view).setDirectionsIconSize(Integer.valueOf(this.b.j(view, (cqtv) obj)));
                                return true;
                            }
                        } else {
                            ((zxb) view).setDirectionsIconSize(Integer.valueOf(((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case 9:
                    if (view instanceof ztj) {
                        if (obj instanceof cqss) {
                            ((ztj) view).setDottedLineColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((ztj) view).setDottedLineColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.w(null);
                            ((ztj) view).setDottedLineColor(null);
                            return true;
                        }
                    }
                    break;
                case 10:
                    if ((view instanceof ztp) && (obj instanceof Float)) {
                        ((ztp) view).setDetailLevel(((Float) obj).floatValue());
                        return true;
                    }
                    break;
                case 11:
                    if (view instanceof ztz) {
                        if (obj instanceof cqss) {
                            ((ztz) view).setInnerCircleColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((ztz) view).setInnerCircleColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.w(null);
                            ((ztz) view).setInnerCircleColor(null);
                            return true;
                        }
                    }
                    if (view instanceof zuc) {
                        boolean z6 = obj instanceof cqss;
                        if (z6) {
                            ((zuc) view).setInnerCircleColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z7 = obj instanceof Number;
                        if (z7) {
                            ((zuc) view).setInnerCircleColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z7) {
                            this.b.w((Number) obj);
                            ((zuc) view).setInnerCircleColor(null);
                            return true;
                        } else if (z6) {
                            ((zuc) view).setInnerCircleColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    break;
                case 12:
                    if ((view instanceof zub) && (obj instanceof cqtv)) {
                        ((zub) view).setIntermediateStopRadius((cqtv) obj);
                        return true;
                    }
                    break;
                case 13:
                    if (view instanceof zty) {
                        if (obj instanceof cqss) {
                            ((zty) view).setLineColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((zty) view).setLineColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.w(null);
                            ((zty) view).setLineColor(null);
                            return true;
                        }
                    }
                    if (view instanceof zvf) {
                        boolean z8 = obj instanceof cqss;
                        if (z8) {
                            ((zvf) view).setLineColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z9 = obj instanceof Number;
                        if (z9) {
                            ((zvf) view).setLineColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z9) {
                            this.b.w((Number) obj);
                            ((zvf) view).setLineColor(null);
                            return true;
                        } else if (z8) {
                            ((zvf) view).setLineColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    break;
                case 14:
                    if (view instanceof zsy) {
                        if (obj instanceof cqtv) {
                            ((zsy) view).setLineWidth(Integer.valueOf(this.b.j(view, (cqtv) obj)));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zsy) view).setLineWidth(Integer.valueOf(((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.x(null);
                            ((zsy) view).setLineWidth(null);
                            return true;
                        }
                    }
                    break;
                case 15:
                    if (view instanceof zxc) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable = (Drawable) obj;
                            cqlg.u(view, drawable);
                            ((zxc) view).setMiddleDividerDrawable(drawable);
                            return true;
                        } else if (obj instanceof cqtd) {
                            ((zxc) view).setMiddleDividerDrawable(this.b.c(view, (cqtd) obj));
                            return true;
                        } else if (obj instanceof Picture) {
                            ((zxc) view).setMiddleDividerDrawable(this.b.d(view, (Picture) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zxc) view).setMiddleDividerDrawable(this.b.e(view, ((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case 16:
                    if ((view instanceof zud) && (obj instanceof Boolean)) {
                        ((zud) view).setNeedPrecedingBullet((Boolean) obj);
                        return true;
                    }
                    break;
                case 17:
                    if ((view instanceof zts) && (obj instanceof Integer)) {
                        ((zts) view).setNumIntermediateStops(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 18:
                    if ((view instanceof zub) && (obj == null || (obj instanceof Integer))) {
                        ((zub) view).setNumStops((Integer) obj);
                        return true;
                    }
                    break;
                case 19:
                    boolean z10 = view instanceof ztp;
                    if (!z10 || (obj != null && !(obj instanceof zto))) {
                        if (z10 && (obj instanceof cqnx)) {
                            ((ztp) view).setElevationChartTouchedListener((cqnx) obj, cqjzVar);
                            return true;
                        }
                    } else {
                        ((ztp) view).setElevationChartTouchedListener((zto) obj);
                        return true;
                    }
                    break;
                case 20:
                    if ((view instanceof zub) && (obj == null || (obj instanceof Integer))) {
                        ((zub) view).setOriginStopIndex((Integer) obj);
                        return true;
                    }
                    break;
                case 21:
                    if ((view instanceof TextView) && (obj == null || (obj instanceof zvb))) {
                        zvd.a((zvb) obj, (TextView) view);
                        return true;
                    }
                    break;
                case 22:
                    if ((view instanceof zst) && (obj instanceof List)) {
                        ((zst) view).setRouteCallouts((List) obj);
                        return true;
                    }
                    break;
                case 23:
                    if ((view instanceof zst) && (obj == null || (obj instanceof zsn))) {
                        ((zst) view).setRouteCalloutSelectedCallback((zsn) obj);
                        return true;
                    }
                    break;
                case 24:
                    if (view instanceof zsz) {
                        if (obj instanceof cqss) {
                            ((zsz) view).setSchematicBottomColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((zsz) view).setSchematicBottomColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.w(null);
                            ((zsz) view).setSchematicBottomColor(null);
                            return true;
                        }
                    }
                    if (view instanceof ztz) {
                        boolean z11 = obj instanceof cqss;
                        if (z11) {
                            ((ztz) view).setSchematicBottomColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z12 = obj instanceof Number;
                        if (z12) {
                            ((ztz) view).setSchematicBottomColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z12) {
                            this.b.w((Number) obj);
                            ((ztz) view).setSchematicBottomColor(null);
                            return true;
                        } else if (z11) {
                            ((ztz) view).setSchematicBottomColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    if (view instanceof zuc) {
                        boolean z13 = obj instanceof cqss;
                        if (z13) {
                            ((zuc) view).setSchematicBottomColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z14 = obj instanceof Number;
                        if (z14) {
                            ((zuc) view).setSchematicBottomColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z14) {
                            this.b.w((Number) obj);
                            ((zuc) view).setSchematicBottomColor(null);
                            return true;
                        } else if (z13) {
                            ((zuc) view).setSchematicBottomColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    break;
                case 25:
                    if (view instanceof zsz) {
                        if (obj instanceof cqss) {
                            ((zsz) view).setSchematicTopColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((zsz) view).setSchematicTopColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.b.w(null);
                            ((zsz) view).setSchematicTopColor(null);
                            return true;
                        }
                    }
                    if (view instanceof ztz) {
                        boolean z15 = obj instanceof cqss;
                        if (z15) {
                            ((ztz) view).setSchematicTopColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z16 = obj instanceof Number;
                        if (z16) {
                            ((ztz) view).setSchematicTopColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z16) {
                            this.b.w((Number) obj);
                            ((ztz) view).setSchematicTopColor(null);
                            return true;
                        } else if (z15) {
                            ((ztz) view).setSchematicTopColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    if (view instanceof zuc) {
                        boolean z17 = obj instanceof cqss;
                        if (z17) {
                            ((zuc) view).setSchematicTopColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                        boolean z18 = obj instanceof Number;
                        if (z18) {
                            ((zuc) view).setSchematicTopColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null || z18) {
                            this.b.w((Number) obj);
                            ((zuc) view).setSchematicTopColor(null);
                            return true;
                        } else if (z17) {
                            ((zuc) view).setSchematicTopColor(Integer.valueOf(this.b.f(view, (cqss) obj)));
                            return true;
                        }
                    }
                    break;
                case 26:
                    if ((view instanceof View) && (view instanceof RecyclerView)) {
                        zve.b((RecyclerView) view, obj, false);
                        return true;
                    }
                    break;
                case 27:
                    if ((view instanceof ztz) && (obj instanceof Boolean)) {
                        ((ztz) view).setShowAsBlockTransfer((Boolean) obj);
                        return true;
                    }
                    break;
                case 28:
                    if ((view instanceof ztz) && (obj instanceof Boolean)) {
                        ((ztz) view).setShowFinalStop((Boolean) obj);
                        return true;
                    }
                    break;
                case 29:
                    if ((view instanceof zwr) && (obj instanceof Boolean)) {
                        ((zwr) view).setSimplifiedTrainCarRecommendation(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    if ((view instanceof View) && (view instanceof RecyclerView)) {
                        zve.b((RecyclerView) view, obj, true);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    if ((view instanceof zub) && (obj instanceof cqtv)) {
                        ((zub) view).setStopIconOffset((cqtv) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    if ((view instanceof zub) && (obj == null || (obj instanceof Integer))) {
                        ((zub) view).setStopIndex((Integer) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    if ((view instanceof zsy) && (obj == null || (obj instanceof jhk))) {
                        ((zsy) view).setVehicleIcon((jhk) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    if ((view instanceof zsy) && (obj == null || (obj instanceof Float))) {
                        ((zsy) view).setVehicleLocationCenter((Float) obj);
                        return true;
                    }
                    break;
                case 35:
                    if ((view instanceof zub) && (obj == null || (obj instanceof Integer))) {
                        ((zub) view).setVehicleIconOffsetPx((Integer) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    if ((view instanceof zwu) && (obj instanceof List)) {
                        ((zwu) view).setTrainCars((List) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    if ((view instanceof zwu) && (obj instanceof dour)) {
                        ((zwu) view).setTrainCarDirectionOfMotion((dour) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    if ((view instanceof zwr) && (obj instanceof dpge)) {
                        ((zwr) view).setTrainCarRecommendationReason((dpge) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    if (view instanceof zxb) {
                        if (obj instanceof cqtv) {
                            ((zxb) view).setTransitLineNameMaxWidth(Integer.valueOf(this.b.i(view, (cqtv) obj)));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zxb) view).setTransitLineNameMaxWidth(Integer.valueOf(((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    if (view instanceof zxb) {
                        if (obj instanceof cqtv) {
                            ((zxb) view).setTransitLineNameMinHeight(Integer.valueOf(this.b.i(view, (cqtv) obj)));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zxb) view).setTransitLineNameMinHeight(Integer.valueOf(((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    if (view instanceof zxb) {
                        if (obj instanceof cqtv) {
                            ((zxb) view).setTransitLineNameMinWidth(Integer.valueOf(this.b.i(view, (cqtv) obj)));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((zxb) view).setTransitLineNameMinWidth(Integer.valueOf(((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    if ((view instanceof zts) && (obj instanceof List)) {
                        ((zts) view).setTransitTrafficSegments((List) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    if ((view instanceof zxb) && (obj instanceof zwz)) {
                        ((zxb) view).setEllipsizeStrategy((zwz) obj);
                        return true;
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    if ((view instanceof zts) && (obj instanceof Float)) {
                        ((zts) view).setUserLocation(((Float) obj).floatValue());
                        return true;
                    }
                    break;
            }
        }
        if (cqkuVar instanceof cqfe) {
            iug iugVar2 = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            cqfe cqfeVar2 = cqfe.ACCESSIBILITY_DELEGATE;
            ztg ztgVar2 = ztg.ARRIVAL_STOP_ICON;
            int ordinal = ((cqfe) cqkuVar).ordinal();
            if (ordinal != 210) {
                if (ordinal == 213 && (view instanceof zvn)) {
                    if (obj instanceof cqsn) {
                        ((zvn) view).setTextAndVisibility(this.b.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((zvn) view).setTextAndVisibility(this.b.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj == null || (obj instanceof CharSequence)) {
                        ((zvn) view).setTextAndVisibility((CharSequence) obj);
                        return true;
                    }
                }
            } else {
                if (view instanceof zvn) {
                    if (obj instanceof cqsn) {
                        ((zvn) view).setText(this.b.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((zvn) view).setText(this.b.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj == null || (obj instanceof CharSequence)) {
                        ((zvn) view).setText((CharSequence) obj);
                        return true;
                    }
                }
                if (view instanceof zvo) {
                    if (obj instanceof cqsn) {
                        ((zvo) view).setText(this.b.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((zvo) view).setText(this.b.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj == null || (obj instanceof CharSequence)) {
                        ((zvo) view).setText((CharSequence) obj);
                        return true;
                    }
                }
            }
        }
        if (cqkuVar instanceof iug) {
            iug iugVar3 = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            cqfe cqfeVar3 = cqfe.ACCESSIBILITY_DELEGATE;
            ztg ztgVar3 = ztg.ARRIVAL_STOP_ICON;
            int ordinal2 = ((iug) cqkuVar).ordinal();
            if (ordinal2 != 27) {
                if (ordinal2 != 70) {
                    if (ordinal2 == 71 && (view instanceof zvt) && (obj == null || (obj instanceof zvs))) {
                        ((zvt) view).setOnDateClickListener((zvs) obj);
                        return true;
                    }
                } else if ((view instanceof zvt) && (obj == null || (obj instanceof zvr))) {
                    ((zvt) view).setOnDateChangedListener((zvr) obj);
                    return true;
                }
            } else if ((view instanceof zvt) && (obj instanceof jej)) {
                ((zvt) view).setDate((jej) obj);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
