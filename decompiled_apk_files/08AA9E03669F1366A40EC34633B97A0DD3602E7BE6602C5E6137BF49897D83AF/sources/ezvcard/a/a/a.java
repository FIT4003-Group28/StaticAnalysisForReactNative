package ezvcard.a.a;

import ezvcard.VCard;
import ezvcard.a.a.a;
import ezvcard.a.b.as;
import ezvcard.a.d;
import ezvcard.a.f;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
/* compiled from: ChainingParser.java */
/* loaded from: classes.dex */
abstract class a<T extends a<?>> {

    /* renamed from: a  reason: collision with root package name */
    final String f5470a;

    /* renamed from: b  reason: collision with root package name */
    final InputStream f5471b;

    /* renamed from: c  reason: collision with root package name */
    final Reader f5472c;

    /* renamed from: d  reason: collision with root package name */
    final File f5473d;
    as e;
    List<List<d>> f;
    final T g;

    abstract f b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InputStream inputStream) {
        this(null, inputStream, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(String str, InputStream inputStream, Reader reader, File file) {
        this.g = this;
        this.f5470a = str;
        this.f5471b = inputStream;
        this.f5472c = reader;
        this.f5473d = file;
    }

    public VCard a() {
        f b2 = b();
        if (this.e != null) {
            b2.a(this.e);
        }
        try {
            VCard a2 = b2.a();
            if (this.f != null) {
                this.f.add(b2.c());
            }
            return a2;
        } finally {
            if (c()) {
                b2.close();
            }
        }
    }

    private boolean c() {
        return this.f5471b == null && this.f5472c == null;
    }
}
