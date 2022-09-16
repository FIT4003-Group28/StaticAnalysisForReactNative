package defpackage;
/* compiled from: PG */
/* renamed from: aoqd  reason: default package */
/* loaded from: classes.dex */
public class aoqd {
    protected volatile aoqu a;
    public volatile aoob b;

    static {
        aoos.a();
    }

    public final aoob a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = aoob.b;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoqd)) {
            return false;
        }
        aoqd aoqdVar = (aoqd) obj;
        aoqu aoquVar = this.a;
        aoqu aoquVar2 = aoqdVar.a;
        if (aoquVar == null && aoquVar2 == null) {
            return a().equals(aoqdVar.a());
        }
        if (aoquVar != null && aoquVar2 != null) {
            return aoquVar.equals(aoquVar2);
        }
        if (aoquVar != null) {
            return aoquVar.equals(aoqdVar.b(aoquVar.mo50getDefaultInstanceForType()));
        }
        return b(aoquVar2.mo50getDefaultInstanceForType()).equals(aoquVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final aoqu b(aoqu aoquVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = aoquVar;
                        this.b = aoob.b;
                    } catch (aopx unused) {
                        this.a = aoquVar;
                        this.b = aoob.b;
                    }
                }
            }
        }
        return this.a;
    }
}
