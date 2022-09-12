package defpackage;

import android.os.Bundle;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.Comparator;
/* compiled from: PG */
@Deprecated
/* renamed from: cooh  reason: default package */
/* loaded from: classes5.dex */
public final class cooh extends cntl<coof> implements cnom {
    public static final Comparator<PlaceLikelihoodEntity> b = new coog();
    public final Status c;
    private final String d;

    public cooh(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.c = coor.a(dataHolder.e);
        switch (i) {
            case 100:
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
            case 102:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case 104:
            case 105:
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                Bundle bundle = dataHolder.f;
                if (bundle != null) {
                    this.d = bundle.getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                } else {
                    this.d = null;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid source: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.c;
    }

    @Override // defpackage.cntn
    /* renamed from: e */
    public final coof d(int i) {
        return new cops(this.a, i);
    }

    public final String toString() {
        cnvu b2 = cnvv.b(this);
        b2.a("status", this.c);
        b2.a("attributions", this.d);
        return b2.toString();
    }
}
