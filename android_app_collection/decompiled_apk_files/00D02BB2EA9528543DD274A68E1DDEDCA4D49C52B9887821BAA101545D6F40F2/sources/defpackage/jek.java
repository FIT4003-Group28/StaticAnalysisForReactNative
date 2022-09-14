package defpackage;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.IllegalFormatConversionException;
/* compiled from: PG */
/* renamed from: jek  reason: default package */
/* loaded from: classes7.dex */
final class jek extends Resources {
    public jek(AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
        super(assetManager, displayMetrics, configuration);
    }

    @Override // android.content.res.Resources
    public final String getString(int i, Object... objArr) {
        try {
            return super.getString(i, objArr);
        } catch (IllegalFormatConversionException e) {
            String string = super.getString(i);
            char conversion = e.getConversion();
            StringBuilder sb = new StringBuilder(2);
            sb.append("%");
            sb.append(conversion);
            return String.format(getConfiguration().locale, string.replaceAll(sb.toString(), "%s"), objArr);
        }
    }
}
