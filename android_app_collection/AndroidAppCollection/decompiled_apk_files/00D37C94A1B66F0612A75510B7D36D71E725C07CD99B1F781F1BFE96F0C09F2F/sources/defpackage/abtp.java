package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.youtube.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: PG */
/* renamed from: abtp  reason: default package */
/* loaded from: classes.dex */
public final class abtp {
    public static abtp a;

    public static void a(Bundle bundle, int i) {
        bundle.putInt("KEY_ADAPTIVE_BITRATE_ALGORITHM", i - 1);
    }

    public static String b(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                sb.append(readLine);
                sb.append("\n");
            }
            return sb.toString();
        } catch (Resources.NotFoundException e) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Shader resource not found: ");
            sb2.append(i);
            throw new RuntimeException(sb2.toString(), e);
        } catch (IOException e2) {
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Error on loading shader: ");
            sb3.append(i);
            throw new RuntimeException(sb3.toString(), e2);
        }
    }

    public static abtl c(Context context, int i) {
        return new abtl(b(context, R.raw.simple_vert), b(context, i));
    }
}
