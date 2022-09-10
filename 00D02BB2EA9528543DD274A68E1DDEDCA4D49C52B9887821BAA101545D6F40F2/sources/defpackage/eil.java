package defpackage;

import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eil  reason: default package */
/* loaded from: classes6.dex */
public class eil implements eik {
    private final Integer a;
    private final Integer b;
    private String c;
    private boolean d;

    public eil(Integer num) {
        this.c = "";
        this.d = false;
        this.a = num;
        this.b = 0;
    }

    public eil(Integer num, Integer num2) {
        this.c = "";
        this.d = false;
        this.a = num;
        this.b = num2;
    }

    private final Integer e() {
        return (!iva.a().booleanValue() || this.b.intValue() <= 0) ? this.a : this.b;
    }

    private static void f(int i, Resources resources) {
        if (String.valueOf(Integer.toHexString(i)).length() == 0) {
            new String("0x");
        }
        try {
            resources.getResourceEntryName(i);
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Override // defpackage.eik
    public final void a(Runnable runnable, Resources resources) {
        bvrj.UI_THREAD.c();
        int intValue = e().intValue();
        InputStream openRawResource = resources.openRawResource(intValue);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ddak.a(openRawResource, byteArrayOutputStream);
            this.c = byteArrayOutputStream.toString(datw.a.name());
            f(intValue, resources);
            this.d = true;
        } catch (IOException unused) {
        }
        runnable.run();
    }

    @Override // defpackage.eik
    public final String b() {
        return this.c;
    }

    @Override // defpackage.eik
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.eik
    public final String d() {
        return Integer.toString(e().intValue());
    }
}
