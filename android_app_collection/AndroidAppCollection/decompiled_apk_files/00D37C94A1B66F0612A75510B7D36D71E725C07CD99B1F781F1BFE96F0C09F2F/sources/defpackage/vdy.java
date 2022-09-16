package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vdy  reason: default package */
/* loaded from: classes4.dex */
public final class vdy implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f269J;
    private boolean L;
    private boolean N;
    private boolean P;
    private boolean R;
    private boolean U;
    private boolean W;
    private boolean Y;
    private boolean Z;
    public boolean n;
    public boolean u;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public vea a = null;
    public vea b = null;
    public vea c = null;
    public vea d = null;
    public vea e = null;
    public vea f = null;
    public vea g = null;
    public vea h = null;
    public vea i = null;
    public vea j = null;
    private vea H = null;
    public vea k = null;
    private vea K = null;
    private vea M = null;
    private vea O = null;
    private vea Q = null;
    private vea S = null;
    private String T = "";
    public int l = 0;
    public String m = "";
    private String V = "";
    private String X = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public boolean r = false;
    public final List s = new ArrayList();
    public final List t = new ArrayList();
    private boolean aa = false;
    public String v = "";
    private boolean ab = false;
    private boolean ac = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            vea veaVar = new vea();
            veaVar.readExternal(objectInput);
            this.w = true;
            this.a = veaVar;
        }
        if (objectInput.readBoolean()) {
            vea veaVar2 = new vea();
            veaVar2.readExternal(objectInput);
            this.x = true;
            this.b = veaVar2;
        }
        if (objectInput.readBoolean()) {
            vea veaVar3 = new vea();
            veaVar3.readExternal(objectInput);
            this.y = true;
            this.c = veaVar3;
        }
        if (objectInput.readBoolean()) {
            vea veaVar4 = new vea();
            veaVar4.readExternal(objectInput);
            this.z = true;
            this.d = veaVar4;
        }
        if (objectInput.readBoolean()) {
            vea veaVar5 = new vea();
            veaVar5.readExternal(objectInput);
            this.A = true;
            this.e = veaVar5;
        }
        if (objectInput.readBoolean()) {
            vea veaVar6 = new vea();
            veaVar6.readExternal(objectInput);
            this.B = true;
            this.f = veaVar6;
        }
        if (objectInput.readBoolean()) {
            vea veaVar7 = new vea();
            veaVar7.readExternal(objectInput);
            this.C = true;
            this.g = veaVar7;
        }
        if (objectInput.readBoolean()) {
            vea veaVar8 = new vea();
            veaVar8.readExternal(objectInput);
            this.D = true;
            this.h = veaVar8;
        }
        if (objectInput.readBoolean()) {
            vea veaVar9 = new vea();
            veaVar9.readExternal(objectInput);
            this.E = true;
            this.i = veaVar9;
        }
        if (objectInput.readBoolean()) {
            vea veaVar10 = new vea();
            veaVar10.readExternal(objectInput);
            this.F = true;
            this.j = veaVar10;
        }
        if (objectInput.readBoolean()) {
            vea veaVar11 = new vea();
            veaVar11.readExternal(objectInput);
            this.G = true;
            this.H = veaVar11;
        }
        if (objectInput.readBoolean()) {
            vea veaVar12 = new vea();
            veaVar12.readExternal(objectInput);
            this.I = true;
            this.k = veaVar12;
        }
        if (objectInput.readBoolean()) {
            vea veaVar13 = new vea();
            veaVar13.readExternal(objectInput);
            this.f269J = true;
            this.K = veaVar13;
        }
        if (objectInput.readBoolean()) {
            vea veaVar14 = new vea();
            veaVar14.readExternal(objectInput);
            this.L = true;
            this.M = veaVar14;
        }
        if (objectInput.readBoolean()) {
            vea veaVar15 = new vea();
            veaVar15.readExternal(objectInput);
            this.N = true;
            this.O = veaVar15;
        }
        if (objectInput.readBoolean()) {
            vea veaVar16 = new vea();
            veaVar16.readExternal(objectInput);
            this.P = true;
            this.Q = veaVar16;
        }
        if (objectInput.readBoolean()) {
            vea veaVar17 = new vea();
            veaVar17.readExternal(objectInput);
            this.R = true;
            this.S = veaVar17;
        }
        this.T = objectInput.readUTF();
        this.l = objectInput.readInt();
        this.m = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.U = true;
            this.V = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.W = true;
            this.X = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.n = true;
            this.o = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.Y = true;
            this.p = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.Z = true;
            this.q = readUTF5;
        }
        this.r = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            vdx vdxVar = new vdx();
            vdxVar.readExternal(objectInput);
            this.s.add(vdxVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            vdx vdxVar2 = new vdx();
            vdxVar2.readExternal(objectInput);
            this.t.add(vdxVar2);
        }
        this.aa = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.u = true;
            this.v = readUTF6;
        }
        this.ab = objectInput.readBoolean();
        this.ac = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F);
        if (this.F) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f269J);
        if (this.f269J) {
            this.K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L);
        if (this.L) {
            this.M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N);
        if (this.N) {
            this.O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P);
        if (this.P) {
            this.Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            this.S.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.T);
        objectOutput.writeInt(this.l);
        objectOutput.writeUTF(this.m);
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            objectOutput.writeUTF(this.V);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.X);
        }
        objectOutput.writeBoolean(this.n);
        if (this.n) {
            objectOutput.writeUTF(this.o);
        }
        objectOutput.writeBoolean(this.Y);
        if (this.Y) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.r);
        int size = this.s.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((vdx) this.s.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.t.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((vdx) this.t.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.aa);
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            objectOutput.writeUTF(this.v);
        }
        objectOutput.writeBoolean(this.ab);
        objectOutput.writeBoolean(this.ac);
    }
}
