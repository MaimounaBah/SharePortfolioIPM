/*
 * Copyright 2022 33760.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp10.metier;

import org.junit.jupiter.api.Assertions;

/**
 *
 * @author 33760
 */
public class JourTest {
    
    public JourTest(){
        
    }
  @org.junit.jupiter.api.Test  
    public void testConstructor(){
        Integer numJour = 3;
        Jour j1 = new Jour(numJour);
        
        Integer result = j1.getNoJour();
        
        Assertions.assertEquals(result, numJour, "L'entier utilisé pour créer un jour doit être le même que celui recupéré par la méthode Jour");
    }
    
}
