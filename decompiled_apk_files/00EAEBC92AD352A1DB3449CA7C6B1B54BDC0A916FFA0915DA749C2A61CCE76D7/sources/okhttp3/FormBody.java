package okhttp3;

import h.c;
import h.d;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder(Charset charset) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset;
        }

        public Builder add(String str, String str2) {
            if (str != null) {
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public Builder addEncoded(String str, String str2) {
            if (str != null) {
                if (str2 == null) {
                    throw new NullPointerException("value == null");
                }
                this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(d dVar, boolean z) {
        c cVar = z ? new c() : dVar.j();
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.mo339writeByte(38);
            }
            cVar.mo331a(this.encodedNames.get(i));
            cVar.mo339writeByte(61);
            cVar.mo331a(this.encodedValues.get(i));
        }
        if (z) {
            long e2 = cVar.e();
            cVar.a();
            return e2;
        }
        return 0L;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public String name(int i) {
        return HttpUrl.percentDecode(encodedName(i), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i) {
        return HttpUrl.percentDecode(encodedValue(i), true);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(d dVar) {
        writeOrCountBytes(dVar, false);
    }
}
