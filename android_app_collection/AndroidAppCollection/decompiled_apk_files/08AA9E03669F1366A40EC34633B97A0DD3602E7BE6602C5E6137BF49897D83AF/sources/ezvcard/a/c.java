package ezvcard.a;

import ezvcard.VCardVersion;
import ezvcard.a.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ParseContext.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private VCardVersion f5494a;

    /* renamed from: b  reason: collision with root package name */
    private List<d> f5495b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Integer f5496c;

    /* renamed from: d  reason: collision with root package name */
    private String f5497d;

    public VCardVersion a() {
        return this.f5494a;
    }

    public void a(VCardVersion vCardVersion) {
        this.f5494a = vCardVersion;
    }

    public Integer b() {
        return this.f5496c;
    }

    public void a(Integer num) {
        this.f5496c = num;
    }

    public String c() {
        return this.f5497d;
    }

    public void a(String str) {
        this.f5497d = str;
    }

    public void a(int i, Object... objArr) {
        this.f5495b.add(new d.a(this).a(i, objArr).a());
    }

    public List<d> d() {
        return this.f5495b;
    }
}
