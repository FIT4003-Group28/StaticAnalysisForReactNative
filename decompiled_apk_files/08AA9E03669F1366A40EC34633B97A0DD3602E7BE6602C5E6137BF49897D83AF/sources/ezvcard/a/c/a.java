package ezvcard.a.c;

import com.b.a.a.b.c;
import com.b.a.a.b.d;
import com.b.a.a.b.g;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.a.b.ao;
import ezvcard.a.b.bg;
import ezvcard.a.d;
import ezvcard.a.e;
import ezvcard.a.f;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ezvcard.property.Label;
import ezvcard.property.VCardProperty;
import ezvcard.util.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: VCardReader.java */
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: d  reason: collision with root package name */
    private final com.b.a.a.b.f f5498d;
    private final VCardVersion e;

    public a(String str) {
        this(str, VCardVersion.V2_1);
    }

    public a(String str, VCardVersion vCardVersion) {
        this(new StringReader(str), vCardVersion);
    }

    public a(InputStream inputStream) {
        this(inputStream, VCardVersion.V2_1);
    }

    public a(InputStream inputStream, VCardVersion vCardVersion) {
        this(new InputStreamReader(inputStream), vCardVersion);
    }

    public a(File file) {
        this(file, VCardVersion.V2_1);
    }

    public a(File file, VCardVersion vCardVersion) {
        this(new BufferedReader(new FileReader(file)), vCardVersion);
    }

    public a(Reader reader) {
        this(reader, VCardVersion.V2_1);
    }

    public a(Reader reader, VCardVersion vCardVersion) {
        c b2 = c.b();
        b2.a(vCardVersion.getSyntaxStyle());
        this.f5498d = new com.b.a.a.b.f(reader, b2);
        this.e = vCardVersion;
    }

    public boolean d() {
        return this.f5498d.b();
    }

    public void a(boolean z) {
        this.f5498d.a(z);
    }

    public Charset e() {
        return this.f5498d.a();
    }

    public void a(Charset charset) {
        this.f5498d.a(charset);
    }

    @Override // ezvcard.a.f
    protected VCard b() {
        b bVar = new b();
        this.f5498d.a(bVar);
        return bVar.f5503b;
    }

    /* compiled from: VCardReader.java */
    /* loaded from: classes.dex */
    private class b implements d {

        /* renamed from: b  reason: collision with root package name */
        private VCard f5503b;

        /* renamed from: c  reason: collision with root package name */
        private final C0124a f5504c;

        /* renamed from: d  reason: collision with root package name */
        private ezvcard.a.b f5505d;

        private b() {
            this.f5504c = new C0124a();
        }

        @Override // com.b.a.a.b.d
        public void a(String str, com.b.a.a.b.b bVar) {
            if (!a(str)) {
                return;
            }
            VCard vCard = new VCard(a.this.e);
            if (this.f5504c.c()) {
                this.f5503b = vCard;
            }
            this.f5504c.a(vCard);
            if (this.f5505d == null) {
                return;
            }
            this.f5505d.a(vCard);
            this.f5505d = null;
        }

        @Override // com.b.a.a.b.d
        public void b(String str, com.b.a.a.b.b bVar) {
            if (!a(str)) {
                return;
            }
            C0124a.C0125a a2 = this.f5504c.a();
            a.this.a(a2.f5500a, a2.f5501b);
            if (!this.f5504c.c()) {
                return;
            }
            bVar.d();
        }

        @Override // com.b.a.a.b.d
        public void a(com.b.a.a.d dVar, com.b.a.a.b.b bVar) {
            if (!a(bVar.a())) {
                return;
            }
            if (this.f5505d != null) {
                this.f5505d.a(null);
                this.f5505d = null;
            }
            VCard vCard = this.f5504c.b().f5500a;
            VCardProperty a2 = a(dVar, vCard.a(), bVar.c());
            if (a2 == null) {
                return;
            }
            vCard.a(a2);
        }

        private VCardProperty a(com.b.a.a.d dVar, VCardVersion vCardVersion, int i) {
            VCardProperty a2;
            String a3 = dVar.a();
            String b2 = dVar.b();
            VCardParameters vCardParameters = new VCardParameters(dVar.c().c());
            String d2 = dVar.d();
            a.this.f5516c.d().clear();
            a.this.f5516c.a(vCardVersion);
            a.this.f5516c.a(Integer.valueOf(i));
            a.this.f5516c.a(b2);
            a(vCardParameters);
            a(vCardParameters, vCardVersion);
            bg<? extends VCardProperty> a4 = a.this.f5515b.a(b2);
            if (a4 == null) {
                a4 = new ao(b2);
            }
            VCardDataType q = vCardParameters.q();
            vCardParameters.a((VCardDataType) null);
            if (q == null) {
                q = a4.b(vCardVersion);
            }
            VCardDataType vCardDataType = q;
            try {
                a2 = a4.c(d2, vCardDataType, vCardParameters, a.this.f5516c);
                a.this.f5514a.addAll(a.this.f5516c.d());
            } catch (ezvcard.a.a e) {
                a2 = a(b2, vCardParameters, d2, vCardDataType, i, vCardVersion, e);
            } catch (ezvcard.a.b e2) {
                a(b2, d2, i, e2);
                a2 = e2.a();
            } catch (e e3) {
                a(b2, i, e3);
                return null;
            }
            a2.setGroup(a3);
            if (a2 instanceof Label) {
                this.f5504c.b().f5501b.add((Label) a2);
                return null;
            }
            a(a2);
            return a2;
        }

        private void a(String str, int i, e eVar) {
            a.this.f5514a.add(new d.a(a.this.f5516c).a(22, eVar.getMessage()).a());
        }

        private VCardProperty a(String str, VCardParameters vCardParameters, String str2, VCardDataType vCardDataType, int i, VCardVersion vCardVersion, ezvcard.a.a aVar) {
            a.this.f5514a.add(new d.a(a.this.f5516c).a(aVar).a());
            return new ao(str).c(str2, vCardDataType, vCardParameters, null);
        }

        private void a(String str, String str2, int i, ezvcard.a.b bVar) {
            if (str2.trim().length() == 0) {
                this.f5505d = bVar;
                return;
            }
            a aVar = new a(com.b.a.a.b.e.a(str2));
            aVar.a(a.this.d());
            aVar.a(a.this.e());
            aVar.a(a.this.f5515b);
            try {
                VCard a2 = aVar.a();
                if (a2 != null) {
                    bVar.a(a2);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                a.this.f5514a.addAll(aVar.c());
                ezvcard.util.f.a(aVar);
                throw th;
            }
            a.this.f5514a.addAll(aVar.c());
            ezvcard.util.f.a(aVar);
        }

        private void a(VCardProperty vCardProperty) {
            Address address;
            String label;
            if ((vCardProperty instanceof Address) && (label = (address = (Address) vCardProperty).getLabel()) != null) {
                address.setLabel(label.replace("\\n", h.f5631a));
            }
        }

        @Override // com.b.a.a.b.d
        public void c(String str, com.b.a.a.b.b bVar) {
            VCardVersion valueOfByStr = VCardVersion.valueOfByStr(str);
            a.this.f5516c.a(valueOfByStr);
            this.f5504c.b().f5500a.a(valueOfByStr);
        }

        @Override // com.b.a.a.b.d
        public void a(g gVar, com.b.a.a.d dVar, Exception exc, com.b.a.a.b.b bVar) {
            if (!a(bVar.a())) {
                return;
            }
            a.this.f5514a.add(new d.a(a.this.f5516c).a(Integer.valueOf(bVar.c())).a(dVar == null ? null : dVar.b()).a(27, gVar.a(), bVar.b()).a());
        }

        private boolean a(List<String> list) {
            if (list.isEmpty()) {
                return false;
            }
            return a(list.get(list.size() - 1));
        }

        private boolean a(String str) {
            return "VCARD".equals(str);
        }

        private void a(VCardParameters vCardParameters) {
            for (String str : vCardParameters.d((VCardParameters) null)) {
                vCardParameters.a((VCardParameters) b(str), str);
            }
        }

        private String b(String str) {
            return VCardDataType.a(str) != null ? "VALUE" : ezvcard.parameter.a.a(str) != null ? "ENCODING" : "TYPE";
        }

        private void a(VCardParameters vCardParameters, VCardVersion vCardVersion) {
            if (vCardVersion == VCardVersion.V2_1) {
                return;
            }
            List<String> n = vCardParameters.n();
            if (n.isEmpty()) {
                return;
            }
            String str = null;
            Iterator<String> it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.indexOf(44) >= 0) {
                    str = next;
                    break;
                }
            }
            if (str == null) {
                return;
            }
            n.clear();
            int i = -1;
            while (true) {
                int i2 = i + 1;
                int indexOf = str.indexOf(44, i2);
                if (indexOf >= 0) {
                    n.add(str.substring(i2, indexOf));
                    i = indexOf;
                } else {
                    n.add(str.substring(i2));
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VCardReader.java */
    /* renamed from: ezvcard.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0125a> f5499a;

        private C0124a() {
            this.f5499a = new ArrayList();
        }

        public void a(VCard vCard) {
            this.f5499a.add(new C0125a(vCard, new ArrayList()));
        }

        public C0125a a() {
            if (c()) {
                return null;
            }
            return this.f5499a.remove(this.f5499a.size() - 1);
        }

        public C0125a b() {
            if (c()) {
                return null;
            }
            return this.f5499a.get(this.f5499a.size() - 1);
        }

        public boolean c() {
            return this.f5499a.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: VCardReader.java */
        /* renamed from: ezvcard.a.c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0125a {

            /* renamed from: a  reason: collision with root package name */
            public final VCard f5500a;

            /* renamed from: b  reason: collision with root package name */
            public final List<Label> f5501b;

            public C0125a(VCard vCard, List<Label> list) {
                this.f5500a = vCard;
                this.f5501b = list;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5498d.close();
    }
}
