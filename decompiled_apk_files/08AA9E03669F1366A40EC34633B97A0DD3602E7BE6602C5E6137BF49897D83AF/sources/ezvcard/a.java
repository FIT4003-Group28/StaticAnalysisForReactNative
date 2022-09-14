package ezvcard;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamite.ProviderConstants;
import ezvcard.util.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* compiled from: Ezvcard.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5464a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f5465b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f5466c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f5467d;

    static {
        InputStream resourceAsStream;
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = a.class.getResourceAsStream("ez-vcard.properties");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            properties.load(resourceAsStream);
            f.a(resourceAsStream);
            f5464a = properties.getProperty(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            f5465b = properties.getProperty("groupId");
            f5466c = properties.getProperty("artifactId");
            f5467d = properties.getProperty(ImagesContract.URL);
        } catch (IOException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            inputStream = resourceAsStream;
            f.a(inputStream);
            throw th;
        }
    }

    public static ezvcard.a.a.b<ezvcard.a.a.b<?>> a(InputStream inputStream) {
        return new ezvcard.a.a.b<>(inputStream);
    }

    private a() {
    }
}
